package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

public class _02_TamsayiVeriTipleri {

    public static void main(String[] args) {

        /*

        byte b = 100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        short c = 100;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


        int a = 4;  // En düşük değeri = -2 ^ 31   en yüksek değeri = 2 ^ 31
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        long d = 100;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

         */


        // byte--> short --> int --> long


         /*
        short j = 1000;

        int i = j / 2;  // short değerini inte çeviriyor ve int değerine bölüyor. Sonra sonucu int e atıyor.

        System.out.println(i);



        short j = 1000;

        short i = j / 2;  // short değerini inte çeviriyor ve int değerine bölüyor. Sonra sonuc int
                                değerinde olduğu için bunu short değerine atayamıyor ve hata veriyor.
                                Çünkü int değerinden short değerine büyük kayıp olabilir.


        short j = 1000;

        int i = j / 2;

        int k = j;

        System.out.println(k);



        byte a = 100;

        byte b = (a / 2); // parantez içinde a byte değeri int değerine çevrilir ve bölüm yapılır.
                         // Çıkan sonuç int değeridir. Sonra bu int değeri byte b olarak atanamaz. Kayıp olacağı için java hata verir.


        byte a = 100;

        byte b = (byte) (a / 2); // bölümden sonra int değerini byte a çevirirsek hata çözülür.

          */

        short i = 100;
        byte j = 2;
        int k = 4;

        long d = i + j + k;
        System.out.println(d);

    }
}
