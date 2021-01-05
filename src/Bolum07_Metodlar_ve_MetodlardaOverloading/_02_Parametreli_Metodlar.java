package Bolum07_Metodlar_ve_MetodlardaOverloading;

public class _02_Parametreli_Metodlar {

    public  static void selamlama(String isim) {
        System.out.println("Selamlar " + isim);
    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Toplamları = " + (a + b + c));
    }

    public static void main(String[] args) {

       selamlama("Hüseyin");
       selamlama("Şenay");

       toplama(3,4,5);
       toplama(10,12,20);


    }
}
