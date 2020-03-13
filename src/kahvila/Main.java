package kahvila;




import javax.sound.midi.Soundbank;
import javax.swing.text.html.HTMLDocument;
import java.sql.SQLOutput;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();

        Scanner ok = new Scanner(System.in);

        while (true) {
            kysySammutus();
                System.out.print("Anna tunnus: ");
                String tunnus = ok.nextLine();
                System.out.print("Anna salasana: ");
                String salasana = ok.nextLine();


            if (tunnus.equals("omistaja") && salasana.equals("joitakin")) {
                System.out.println("Tervetuloa omistaja!");
                while (true) {
                    System.out.println("Komennot: lisää, listaa, poista, kirjaudu ulos");
                        String komento = kysyKomento();
                    if (komento.equals("lisää")) {
                        System.out.print("Anna tuotteen nimi: ");
                        String sana = ok.nextLine();
                        System.out.print("Anna tuotteen hinta: ");
                        int hinta = Integer.parseInt(ok.nextLine());
                        Tuote ast = new Tuote(sana, hinta);
                        kahvila.LisaaTuote(ast);
                        for (Tuote kaynti : kahvila.getTuote()) {
                            System.out.println(kaynti.getNimi() + ", hinta " + kaynti.getHinta() + " e");
                        }

                    }

                    else if (komento.equals("listaa")) {
                        System.out.println("Tässä tämän hetkiset tuotteet: ");
                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " e");
                        }
                    }

                    else if (komento.equals("poista")) {
                        System.out.println("Minkä tuotteen seuraaavista tuotteista haluat poistaa?");
                        String poisto = ok.nextLine();
                        kahvila.poistaTuote(poisto);

                        System.out.println("Tässä tämän hetkiset tuotteet: ");
                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " e");
                        }
                    }
                    else if (komento.equals("kirjaudu ulos")) {
                        System.out.println("kirjaudutaan ulos...");
                        break;
                    }





                }
            }
            else if (tunnus.equals("asiakas") && (salasana.equals("kahvi"))) {
                Asiakas asiakas = new Asiakas(100);
                System.out.println("Olet kirjautunut asiakkaana!");
                while (true) {
                    System.out.println("Komennot: osta, saldo, kirjaudu ulos");
                    String komento = kysyKomento();
                    if (komento.equals("osta")) {
                        System.out.println("Sinulla on käytettävissäsi " + asiakas.tulostaRaha());
                        System.out.println("Tämän henkiset tuotteemme: ");
                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", " + a.getHinta());
                        }
                        System.out.print("Minkä haluat ostaa: ");
                        String ostettava = ok.nextLine();
                        for (Tuote a : kahvila.getTuote()) {
                            if (a.getNimi().equals(ostettava)) {
                                asiakas.otaRaha(a.getNimi(), a.getHinta());
                            }
                        }

                    }
                    else if (komento.equals("saldo")) {
                        System.out.println("Sinulla on käytössäsi: " + asiakas.tulostaRaha() + "€");
                    }
                    else if (komento.equals("kirjaudu ulos")) {
                        System.out.println("Kirjaudutaan ulos...");
                        break;
                    }
                }

            }

        }
    }

    private static void kysySammutus() {
     Scanner ok = new Scanner(System.in) ;
        System.out.print("Haluatko kirjautua tai sammuttaa ohjelman (sammuta/kirjaudu): ");
        String joku = ok.nextLine();
        if (joku.equals("sammuta")) {
            System.exit(0);
        }
        else if (joku.equals("kirjaudu")) {}
    }


    public static String kysyKomento() {

        Scanner ok = new Scanner(System.in);
        System.out.print("Anna komento: ");
        String komento = ok.nextLine();
        return komento;
    }
}