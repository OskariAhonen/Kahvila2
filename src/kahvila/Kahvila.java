package kahvila;



import java.util.*;

public class Kahvila {
    private List<Tuote> tuotteet;
    public Kahvila() {
        this.tuotteet = new ArrayList<>();
    }
public List<Tuote> getTuote() {
        return tuotteet;
    }
    public void LisaaTuote(Tuote c){
    tuotteet.add(c);
    }
    public void poistaTuote(int b) {
        tuotteet.remove(b);
    }

}