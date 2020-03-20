package kahvila;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.HTMLDocument;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Asiakas asiakas = new Asiakas();
        Scanner ok = new Scanner(System.in);

        while (true) {
            //Kirjautuminen
            System.out.print("Anna tunnus: ");
            String tunnus = ok.nextLine();
            System.out.print("Anna salasana: ");
            String salasana = ok.nextLine();
                //omistaja
            if (tunnus.equals("omistaja") && salasana.equals("joitakin")) {
                System.out.println("Tervetuloa omistaja!");
                while (true) {
                    System.out.println("Komennot: lisää, listaa, poista, kirjaudu ulos");
                        String komento = kysyKomento();
                    // omistaja voi lisätä tuotteita
                    if (komento.equals("lisää")) {
                        System.out.print("Anna tuotteen nimi: ");
                        String sana = ok.nextLine();
                        System.out.print("Anna tuotteen hinta: ");
                        int hinta = Integer.parseInt(ok.nextLine());
                        Tuote ast = new Tuote(sana, hinta);
                        kahvila.LisaaTuote(ast);

                        for (Tuote kaynti : kahvila.getTuote()) {
                            System.out.println(kaynti.getNimi() + ", hinta " + kaynti.getHinta() + " €");
                        }

                    }
                    // Listaa listalla olevat tuotteet
                    else if (komento.equals("listaa")) {
                        System.out.println("Tässä tämän hetkiset tuotteet: ");

                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " e");
                        }
                    }
                    // Omistaja voi poistaa tuotteita listalta
                    else if (komento.equals("poista")) {
                        System.out.print("Minkä tuotteen haluat poistaa: ");
                        String poisto = ok.nextLine();
                        kahvila.poistaTuote(poisto);


                    }
                    //Ulos kirjautuminen
                    else if (komento.equals("kirjaudu ulos")) {
                        System.out.println("kirjaudutaan ulos...");
                        kysySammutus();
                        break;
                    }

                }
            }
            //Asiakas alkaa
            else if (tunnus.equals("asiakas") && (salasana.equals("kahvi"))) {
                System.out.println("Olette kirjautunut asiakkaana!");
                while (true) {
                    System.out.println("Komennot: osta, saldo, kirjaudu ulos, tuotteet, bonus");
                    String komento = kysyKomento();
                        //Asiakas voi ostaa tuotteita
                    if (komento.equals("osta")) {
                        System.out.println("Sinulla on käytettävissäsi " + asiakas.tulostaRaha());
                        System.out.println("Tämän henkiset tuotteemme: ");
                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", " + a.getHinta() + "€");
                        }
                        System.out.print("Minkä haluat ostaa: ");
                        String ostettava = ok.nextLine();
                        for (Tuote a : kahvila.getTuote()) {
                            if (a.getNimi().equals(ostettava)) {
                                asiakas.otaRaha(a.getNimi(), a.getHinta());
                            }
                        }

                    } // litaa tuotteet
                    else if (komento.equals("tuotteet")) {
                        System.out.println("Tässä on meidän tämän hetkiset tuotteet:");
                        for (Tuote a : kahvila.getTuote()) {
                            System.out.println(a.getNimi() + ", " + a.getHinta() + "€");
                        }
                    } // näyttää saldon
                    else if (komento.equals("saldo")) {
                        System.out.println("Sinulla on käytössäsi: " + asiakas.tulostaRaha() + "€");
                    } //kirjautuminen ulos
                    else if (komento.equals("kirjaudu ulos")) {
                        System.out.println("Kirjaudutaan ulos...");
                        kysySammutus();
                        break;
                    } // näyttää bonus-pisteet
                    else if (komento.equals("bonus")) {
                        System.out.println("Bonuspisteesi: " + asiakas.getBonus());
                    }

                }

            }

        }
    }
        // metodit
        public static void kysySammutus() {
     Scanner ok = new Scanner(System.in) ;
        while (true) {
            System.out.print("Haluatko kirjautua tai sammuttaa ohjelman (sammuta/kirjaudu): ");
            String joku = ok.nextLine();
            if (joku.equals("sammuta")) {
                System.exit(0);
            }
            else if (joku.equals("kirjaudu")) {break;}
        }
        }


    public static String kysyKomento() {

        Scanner ok = new Scanner(System.in);
        System.out.print("Anna komento: ");
        String komento = ok.nextLine();
        return komento;
    }
}