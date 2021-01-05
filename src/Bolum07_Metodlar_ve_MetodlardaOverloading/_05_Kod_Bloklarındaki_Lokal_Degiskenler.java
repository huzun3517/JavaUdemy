package Bolum07_Metodlar_ve_MetodlardaOverloading;

public class _05_Kod_Bloklarındaki_Lokal_Degiskenler {

    public static void toplama(int a, int b, int c) {

        System.out.println("Toplama Sonucu: " + (a + b + c));

        int deneme = 10;

    }




    public static void main(String[] args) {

        /*
        int a = 4;
        String yazdir = "Merhaba";

        if (a < 10) {
            int b = 5; // b Lokal değişkendir. Sadece if bloğunda çalışır.
            System.out.println(yazdir);
        }

        System.out.println(b); // burada b yi kullanamıyoruz. Çünkü if bloğunda kullanıldı.
                                  Lokal değişkendir.

        */


        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i); // i yi burada kullanamıyoruz. java hata veriyor.
                                  Çünkü i sadece for döngüsünde tanımlı.
         */



        /*
        int i;   // i yi kod bloğu dışında tanımladık. oyuzden heryerde tekrar kullanabiliyoruz.

        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i);
         */


        /*
        int i = 1;

        while (i < 10) {

            if (i % 2 == 0) {

                String yazdir = "Çift";
                System.out.println(yazdir);   // yazdir if bloğu içinde kullanıldı.
                                                 Yani Lokal değişken.
            }

            System.out.println(yazdir);       // yazdir if bloğu dışında kullanıldığı için
             i++;                                java hata verdi.
         */



        /*
        toplama(10,20,30);

        System.out.println(a); // a direk olarak tanımlı değil. Java hata verir.
                                  a toplama metodu içinde tanımlı.
                                  Yani a main metodu içinde tanımlı değil.

        System.out.println(deneme); // deneme main metodu içinde değil. Oyüzden java hata verir.
                                       Lokal değişken.
        */


        }

    }

