package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._04_Scope_Ozelliklerin_Kapsami;

public class Main {

    public static void main(String[] args) {

        KapsamSinifi kapsamSinifi = new KapsamSinifi();
        kapsamSinifi.onIleCarp();

        System.out.println("*******************************");

        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
        kapsam.onIleCarp();

     //   System.out.println(kapsam.a);  --> burada a ya ulaşamaz.


    }
}
