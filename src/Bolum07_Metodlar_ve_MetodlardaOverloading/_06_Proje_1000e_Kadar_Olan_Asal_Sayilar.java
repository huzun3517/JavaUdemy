package Bolum07_Metodlar_ve_MetodlardaOverloading;

public class _06_Proje_1000e_Kadar_Olan_Asal_Sayilar {
    public static boolean asalMi(int sayi) {

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

         /*
        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.
        Asal sayı: 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.

         */


        for (int i = 2; i < 1000; i++) {

            if (asalMi(i)) {
                System.out.println(i);
            }
        }

    }
}
