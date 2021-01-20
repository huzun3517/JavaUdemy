package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

public class _03_Float_Double {

    public static void main(String[] args) {

        // Double : 64 bit - 8 bit
        // Float  : 32 bit - 4 bit

        // Otomatik Dönüştürme : int--> float --> double

        /*
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        System.out.println(c);


        float a = 5.0;      // Hata verir. Çünkü 5.0 değeri double birdeğerdir. Floata atanamaz.
                            // Sağdan sola dönüştürme işlemi olmuyor.



        float a = (float)5.0;  // Double değerini floata dönüştürüp sonra float değerine atayabiriz.
        float b = 5f;
        float c = 5.2f;


        int a = 22 / 7;
        float b = 22f / 7f;
        double c = 22d / 7d;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);


        int i = 5;
        double j = i;
        System.out.println(j);


        double i = 3.52;
        float j = i;    // Java hata verecek. Çünkü i double değeridir. Double değerini float değerine atayamayız.


        double i = 3.52;
        float j = (float) i;
        System.out.println(j);

         */

        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;

        float a = 70.25f;
        float b = 60f;
        float c = 80.2f;

        System.out.println("Ortalama: " + (sayi1 + sayi2 + sayi3) / 3);
        System.out.println("Ortalama2: " + (a + b + c) / 3);

    }
}

