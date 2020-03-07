package kahvila;




import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner ok = new Scanner(System.in);
        Kahvila kahvila = new Kahvila();
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
                        for (Tuote kaynti: kahvila.getTuote()) {
                            System.out.println(kaynti.getNimi() + ", hinta " + kaynti.getHinta() + " e");
                        }
                    } else if (komento.equals("Poista")) {
                        System.out.println("Minkä tuotteen haluat poistaa?");
                        for (Tuote g: kahvila.getTuote()) {
                            System.out.println(g.getNimi() + ", hinta " + g.getHinta() + " e");
                        }
                    }
                    else  if (komento.equals("Listaa")) {
                        for (Tuote abc: kahvila.getTuote()) {
                        System.out.println(abc.getNimi());
                        }
                    }
                }
            }


        }
    }


}


