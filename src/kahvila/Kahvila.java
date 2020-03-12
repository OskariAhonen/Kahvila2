package kahvila;





import java.util.*;

public class Kahvila {

    public List<Tuote> tuotteet;

    public Kahvila() {
        this.tuotteet = new ArrayList<>();
    }

    public List<Tuote> getTuote() {
        return tuotteet;
    }

    public void LisaaTuote(Tuote c) {
        tuotteet.add(c);
    }

    public void poistaTuote(int a) {
    tuotteet.remove(a);
    }

    public int getIndex(String poisto) {
        return tuotteet.indexOf(poisto);
    }


    public int suuri() {
        return tuotteet.size();
    }
}
