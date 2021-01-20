package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._01_Object_Oriented_Programlamaya_Giriş;

public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba();


        araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.renk);
        System.out.println(araba1.kapilar);
        System.out.println(araba1.tekerlekler);
        System.out.println(araba1.motor);
        System.out.println(araba1.model);


    }
}
