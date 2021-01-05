package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._04_Proje_Hafiza_Oyunu;

public class Kart {

    private char deger;
    private boolean tahmin = false;

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
