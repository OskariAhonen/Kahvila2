package kahvila;


import javax.swing.*;
import java.util.*;

public class Kahvila {
    private List<Tuote> tuotelista;
    public Kahvila() {
        this.tuotelista = new ArrayList<>();
    }
public List<Tuote> getTuotelista() {
        return tuotelista;
    }
    public void LisaaTuote(Tuote t){
    tuotelista.add(t);
    }





}