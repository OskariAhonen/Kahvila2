package kahvila;




import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Kahvila tuotteet = new Kahvila();
        Scanner ok = new Scanner(System.in);

        while (true) {
            System.out.print("Anna käyttäjätunnus: ");
            String tunnus = ok.nextLine();
            System.out.print("Anna salasana: ");
            String salasana = ok.nextLine();

            if (tunnus.equals("omistaja") && salasana.equals("joitakin")) {
                System.out.println("Tervetuloa omistaja!");
                while (true) {
                    System.out.println("Anna komento: ");
                    String komento = ok.nextLine();
                    if (komento.equals("Lisää")) {
                        System.out.print("Anna tuotteen nimi: ");
                        String sana = ok.nextLine();
                        System.out.print("Anna tuotteen hinta: ");
                        int hinta = Integer.parseInt(ok.nextLine());
                        Tuote ast = new Tuote(sana, hinta);
                        tuotteet.LisaaTuote(ast);
                        for (Tuote kaynti : tuotteet.getTuote()) {
                            System.out.println(kaynti.getNimi() + ", hinta " + kaynti.getHinta() + " e");
                        }
                    } else if (komento.equals("Poista")) {
                        System.out.println("Minkä tuotteen seuraaavista tuotteista haluat poistaa?");
                        String poisto = ok.nextLine();
                        int b = 0;
                        for (Tuote a : tuotteet.getTuote()) {


                            if (poisto.contains(a.getNimi())) {
                                tuotteet.poistaTuote(b);

                            }
                            b = b + 1;
                        }
                    }

                        if (komento.equals("Listaa")) {
                            System.out.println("Tässä tämän hetkiset tuotteet: ");
                            for (Tuote a : tuotteet.getTuote()) {
                                System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " e");
                            }
                        }




                }
            }


        }
    }
}