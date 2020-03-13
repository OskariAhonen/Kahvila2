package kahvila;





import java.util.*;

public class Kahvila {

    private List<Tuote> tuotteet;

    public Kahvila() {
        this.tuotteet = new ArrayList<>();
        tuotteet.add(new Tuote("omppu", 1));
        tuotteet.add(new Tuote("piirakka", 5));
    }

    public List<Tuote> getTuote() {
        return tuotteet;
    }

    public void LisaaTuote(Tuote c) {
        tuotteet.add(c);
    }

    public void poistaTuote(String poistettava) {

        int indeksi = -1;
        for (Tuote tuote: tuotteet) {
            if (tuote.getNimi().equals(poistettava)) {
                indeksi = tuotteet.indexOf(tuote);

            }

        }

        if (indeksi == -1) {
            System.out.println("Tuotetta ei ole");
        } else {
            System.out.println("Tuote poistettiin!");
            tuotteet.remove(indeksi);
        }

    }





}
