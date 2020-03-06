package kahvila;


import javax.swing.*;
import java.util.*;

public class Kahvila {
    private List<Tuote> tuotelista;
    public Kahvila() {
        this.tuotelista = new ArrayList<>();
    }
public List<Tuote> getTuote() {
        return tuotelista;
    }
    public void LisaaTuote(Tuote tuote){
    tuotelista.add(tuote);
    }





}