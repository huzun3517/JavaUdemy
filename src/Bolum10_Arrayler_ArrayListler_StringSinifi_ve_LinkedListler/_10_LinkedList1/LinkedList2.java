package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._10_LinkedList1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {

        /* 1.Yöntem
        for (String s: gidilecek_yerler) {
            System.out.println(s);
        }
         */

            //2.Yöntem
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){

            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0 ){
                // iki değer eşit
                System.out.println("Listenizde bu elaman zaten var");
                return; // return ü sadece döngüyü sonlandırmak için kullandık.
            }
            else if (karsilastir < 0) {
                // Yeni değer iterator.nex ten daha büyük ise.

            }

            else if (karsilastir > 0){
                // Yeni değer iterator.nex ten daha küçük ise.

                iterator.previous(); // iterator ü geri aldık.
                iterator.add(yeni);

                return;

            }

        }


        iterator.add(yeni);



    }




    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
/*
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        listeyi_bastir(gidilecek_yerler);

        System.out.println("------------------------------------------");

        // Kütüphaneden sonra alışveriş merkezine gitmek istiyorum...
        gidilecek_yerler.add(4,"Alışveriş Merkezi");

        listeyi_bastir(gidilecek_yerler);

        System.out.println("-----------------------------------------------");

        gidilecek_yerler.remove(3); //3. index teki değeri siliyorum. Kütüphaneyi sildik.

        listeyi_bastir(gidilecek_yerler);
 */

        sirali_ekle(gidilecek_yerler,"Postane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"Ev");

        listeyi_bastir(gidilecek_yerler); // alfabetik duruma göre sıralıyor.


        



    }
}