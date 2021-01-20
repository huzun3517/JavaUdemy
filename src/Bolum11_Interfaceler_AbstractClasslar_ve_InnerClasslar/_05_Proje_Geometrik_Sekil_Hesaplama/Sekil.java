package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._05_Proje_Geometrik_Sekil_Hesaplama;

public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {

        this.isim = isim;
    }

    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}


