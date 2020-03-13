package kahvila;
import java.util.*;
public class Asiakas {
    private int raha;
    private int bonus;

    public Asiakas() {
        this.raha = 100;
        this.bonus = 0;
    }

    public int tulostaRaha() {
        return this.raha;
    }
    public int getBonus() {
        return this.bonus;
    }
    public void otaRaha(String tuote, int maksu) {
        Scanner ok = new Scanner(System.in);
       if (bonus < 10) {
           System.out.print("Oletko varma että haluat ostaa tuotteen " + tuote + ": ");
           String vahvistus = ok.nextLine();

               if (vahvistus.equals("kyllä")) {
                   if (raha < maksu) {
                       System.out.println("Tuotetta ei voi ostaa, liian vähän rahaa");
                   } else {
                      this.raha = raha - maksu;
                       System.out.println("tuote ostetiin.");
                       this.bonus = this.bonus + 1;
                   }
               }

           else {
               System.out.println("Tuotetta ei osteta");
           }
       }
       else if (bonus == 10) {
           System.out.print("Haluatko käyttää 10 bonuspistettä saadaksesi tuotteen ilmaiseksi: ");
           String b = ok.nextLine();
           if (b.equals("kyllä")) {
               System.out.println("Tuote ostetiin!");
               bonus = bonus - 10;
           }
           else if (b.equals("ei")) {
               System.out.print("Oletko varma että haluat ostaa tuotteen rahoillasi: " + tuote + ": ");
               String vahvistus = ok.nextLine();
               if (vahvistus.equals("kyllä")) {
                   if (raha < maksu) {
                       System.out.println("Tuotetta ei voi ostaa, liian vähän rahaa");
                   } else {
                       raha = raha - maksu;
                       System.out.println("Tuote ostettiin!");
                   }
               }
               if (vahvistus.equals("ei")) {
                   System.out.println("Tuotetta ei osteta!");
               }

           }
       }

    }



}