package kahvila;





import java.util.*;

public class Kahvila {

    private List<Tuote> tuotteet;

    public Kahvila() {
        this.tuotteet = new ArrayList<>();
        tuotteet.add(new Tuote("omppu", 16));
    }

    public List<Tuote> getTuote() {
        return tuotteet;
    }

    public void LisaaTuote(Tuote c) {
        tuotteet.add(c);
    }

    public void poistaTuote(String poistettava) {

        int indeksi = 0;
        for (Tuote tuote: tuotteet) {
            if (tuote.getNimi().equals(poistettava)) {
                indeksi = tuotteet.indexOf(tuote);
            }
        }
        tuotteet.remove(indeksi);


    }





}
