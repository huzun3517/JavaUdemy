package Bolum05_KosulluDurumlar_ve_KodBloklari;

public class _02_Mantiksal_Operatorler {

    public static void main(String[] args) {

        /*
        Mantıksal Operatörler

        && ----> and Operatörü
          Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.

        || ----> or Operatörü
          Sonuçlardan en az birisi bile true ise genel sonuç true, hepsi false ise genel sonuç false olur.

        ! ----> not Operatörü

         */

        System.out.println(3 == 3); // true
        System.out.println(2 < 3);  // true

        System.out.println(3 == 3 && 2 < 3);  // true Çünkü tüm işlemler kendi içinde true.
        System.out.println(3 == 3 && 2 > 3);  // false Çünkü içteki işlemlerden biri false

        System.out.println(3 == 3 && 2 > 3 && "Murat" == "Murat"); // false
        System.out.println(3 == 3 && 2 < 3 && "Murat" == "Murat"); // true

        System.out.println(3 == 3 && 2 > 3 || "Murat" == "Murat"); // true
        System.out.println(3 != 3 && 2 > 3 || "Murat" != "Murat"); // false

        System.out.println(! false); // true
        System.out.println(!(3 < 4)); // false

        System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1));  // false

    }
}
