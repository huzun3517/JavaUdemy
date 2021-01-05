package Bolum07_Metodlar_ve_MetodlardaOverloading;

public class _03_Metodlarda_Return {

   /*
   public static int toplama(int a, int b, int c) {

      return (a + b + c); // void return fonksiyonunu döndüremiyor. Veri tipi girmek gerekiyor.
                             burada int kullandık.
    }
    */


     /*
     public static int iki_ile_carp(int a) {
        return a * 2;
    }


    public static int iki_ile_topla(int a) {
        return a + 2;
    }


    public static int dort_ile_carp(int a){
        return a * 4;
    }

     */


    public static int deneme(int a) {

        System.out.println("Çıktı veriliyor...");
        return a * 2;
    }



    public static void main(String[] args) {


     //   System.out.println("Çıktı değeri " + toplama(1,2,3) );


     //   System.out.println("Sonuç " + dort_ile_carp(iki_ile_topla(iki_ile_carp(8))));


        System.out.println(deneme(4));



    }
}
