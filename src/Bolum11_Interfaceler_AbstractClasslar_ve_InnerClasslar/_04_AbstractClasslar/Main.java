package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._04_AbstractClasslar;

public class Main {

    public static void main(String[] args) {

//        Sekil sekil = new Sekil();
        // todo Abstract Class lardan tıpkı İnterface lerdeki gibi obje oluşturamayız.
        //  Fakat referans alabiliriz

        Kare kare = new Kare("Kare",5);
        Daire daire = new Daire("Daire",3);

        kare.alan_hesapla();
        daire.alan_hesapla();

        kare.cevre_hesapla(); // todo Kare objesinin kendine has metodu olan cevre() methodunu çağırdık.

        Sekil sekil = new Kare("Kare2",6); // todo Abstract classı referans aldık.
        sekil.alan_hesapla();

//      sekil.cevre_hesapla(); //
//      todo Abstract class ı referans alırsak kare objesinin kendine has olan methodunu burada çağıramayız.








    }
}
