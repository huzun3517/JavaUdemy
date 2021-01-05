package Bolum05_KosulluDurumlar_ve_KodBloklari;

public class _01_Karsilastirma_Operatorleri {

    public static void main(String[] args) {
        /*
        Karşılaştırma Operatörleri

        == ----> Eşit mi?
        != ----> Eşit Değil mi?
        >  ----> Büyük mü?
        >= ----> Büyük veya Eşit mi?
        <  ----> Küçük mü?
        <= ----> Küçük veya Eşit mi?
         */

        System.out.println(3 == 3);  // eşitlik olduğu için ekrana true yazdırır
        System.out.println(3 == 4); // eşitlik olmadığı için ekrana false yazdırır.

        System.out.println(3 != 4); // eşit olmadığı için true
        System.out.println(2 > 3); // büyük olmadığı için false
        System.out.println(2 >= 1); // true
        System.out.println(2 < 3); // true
        System.out.println(2 <= 1); // false

        System.out.println("Mehmet" == "Mehmet");  // true
      //  System.out.println("Mehmet" < "Mehmet");  // Java hata verir.


    }
}
