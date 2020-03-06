package kahvila;



import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        Kahvila kahvila = new Kahvila();
while (true){
    System.out.println("Anna käyttäjätunnus: ");
    String tunnus = ok.nextLine();
    System.out.println("Anna salasana: ");
    String salasana = ok.nextLine();
    if (tunnus.equals("omistaja") && salasana.equals("joitakin")){
        System.out.println("Tervetuloa omistaja!");
        System.out.print("Anna tuotteen nimi: ");
        String sana = ok.nextLine();
        System.out.print("Anna tuotteen hinta: ");
        int hinta = Integer.parseInt(ok.nextLine());
        Tuote a = new Tuote(sana, hinta);
        kahvila.LisaaTuote(a);
    }
}




    }
}

