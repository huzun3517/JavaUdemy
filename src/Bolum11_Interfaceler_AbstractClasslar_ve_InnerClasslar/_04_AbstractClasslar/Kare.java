package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._04_AbstractClasslar;

public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {

        System.out.println(getIsim() + " alanı " + (kenar*kenar) + " dır");
    }

    public void cevre_hesapla() {

        System.out.println(getIsim() + " cevresi " + (4*kenar));
    }
}
