package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._05_Proje_Geometrik_Sekil_Hesaplama;

public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla()  {


        System.out.println(getIsim() + " in alanı " + (kenar*kenar));
    }


}
