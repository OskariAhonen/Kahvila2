package kahvila;
// Tuote luokka
public class Tuote {
private String nimi;
private int hinta;

public Tuote(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
        }

public String getNimi() {
        return this.nimi;
        }

        public int getHinta() {
    return this.hinta;
        }
        }
