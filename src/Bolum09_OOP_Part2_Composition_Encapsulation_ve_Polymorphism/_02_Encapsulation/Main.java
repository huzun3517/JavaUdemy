package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._02_Encapsulation;

public class Main {

    public static void main(String[] args) {

       /* Abone abone = new Abone();

        abone.isim = "Hüseyin Uzun";
        abone.bakiye = 200;
        abone.sehir = "İzmir";

        abone.dogalgaz_kullan(200);

        */

        GelismisAbone abone = new GelismisAbone("Hüseyin Uzun",200,"İzmir");
        abone.bakiye_ogren();





    }
}
