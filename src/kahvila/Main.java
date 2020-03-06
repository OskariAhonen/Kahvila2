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
                        lisääTuote();
                    } else if (komento.equals("Poista")) {
                        System.out.println("Minkä tuotteen haluat poistaa?");
                        for (Tuote a: tuotelista) {
                            System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " e");
                        }
                    }
                }
            }


        }
    }
    public static void lisääTuote() {
        Kahvila kahvila = new Kahvila();
        Scanner ok = new Scanner(System.in);
        System.out.print("Anna tuotteen nimi: ");
        String sana = ok.nextLine();
        System.out.print("Anna tuotteen hinta: ");
        int hinta = Integer.parseInt(ok.nextLine());
        Tuote a = new Tuote(sana, hinta);
        tuotelista.LisaaTuote(a);
        System.out.println(a.getNimi());
    }

}


