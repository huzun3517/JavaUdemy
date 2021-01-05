package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._02_Classlarin_Metodlari;

public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba();

        /*
        araba1.setModel("Renault");

        System.out.println("Arabanın modeli " + araba1.getModel());

        araba1.setKapilar(-4);

         */

        /*
        Araba araba2;
        araba2.setKapilar(10);  // araba2 referansını oluşturduk fakat buna herhangi bir obje atamadık.
                                // Bu sebepten java burda hata verir.

         */

        Araba araba3 = null; // bu referans javada herhangi bir yerde göstermiyor anlamına geliyor.

        araba3.setModel("Renault"); //NullPointerException hatası veriyor.
                                    // Çünkü araba3 referansı herhangi bir obje göstermiyor.


    }


}
