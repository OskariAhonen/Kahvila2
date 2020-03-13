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
            System.out.print("Anna käyttäjätunnus: ");
            String tunnus = ok.nextLine();
            System.out.print("Anna salasana: ");
            String salasana = ok.nextLine();

            if (tunnus.equals("omistaja") && salasana.equals("joitakin")) {
                System.out.println("Tervetuloa omistaja!");
                while (true) {
                    System.out.println("Anna komento: ");
                    String komento = ok.nextLine();

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






                }
            }


        }
    }
}