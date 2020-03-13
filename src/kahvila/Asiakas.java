package kahvila;
import java.util.*;
public class Asiakas {
    private int raha;

    public Asiakas(int raha) {
        this.raha = raha;
    }

    public int tulostaRaha() {
        return this.raha;
    }

    public void otaRaha(String tuote, int maksu) {
        Scanner ok = new Scanner(System.in);
        System.out.print("Oletko varma että haluat ostaa tuotteen " + tuote + ": ");
        String vahvistus = ok.nextLine();
        if (vahvistus.equals("kyllä")) {
            this.raha = this.raha - maksu;
            System.out.println("Maksu suoritettu!");
        }
        else {
            System.out.println("Tuotetta ei osteta");
        }

    }



}