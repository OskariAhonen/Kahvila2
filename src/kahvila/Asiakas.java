package kahvila;
public class Asiakas {
    private int raha;
    public int Asiakas(int raha) {
        this.raha = raha;
        return raha;
    }

    public int tulostaRaha() {
        int raha = this.raha;
        return this.raha;
    }

    public void otaRaha(int maksu) {
        this.raha = this.raha - raha;
    }



}