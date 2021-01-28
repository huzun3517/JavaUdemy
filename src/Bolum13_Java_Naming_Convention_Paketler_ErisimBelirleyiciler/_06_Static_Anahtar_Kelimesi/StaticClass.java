package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._06_Static_Anahtar_Kelimesi;

public class StaticClass {

    public static int obje_sayisi = 0;
    private static String isim;

    public StaticClass(String isim){
        this.isim = isim;

        obje_sayisi++;
    }

    public static String getIsim(){
        return isim;
    }
}
