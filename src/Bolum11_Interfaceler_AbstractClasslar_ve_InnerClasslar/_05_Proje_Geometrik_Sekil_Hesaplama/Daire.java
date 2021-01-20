package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._05_Proje_Geometrik_Sekil_Hesaplama;

public class Daire extends Sekil {

    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla()  {


        System.out.println(getIsim() + " in alanı: " + (Math.PI*yaricap*yaricap));
    }
}
