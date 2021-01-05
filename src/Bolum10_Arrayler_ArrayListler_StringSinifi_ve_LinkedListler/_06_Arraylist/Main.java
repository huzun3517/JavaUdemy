package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._06_Arraylist;

import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String> a)  {

        for (int i = 0; i < a.size(); i++) {

            System.out.println("Element " + (i + 1) + ": " + a.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Metallica");
        arraylist.add("Guns' n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Metallica");

    /*  System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(3));
        System.out.println(arraylist.get(5)); */  // 5 olmadığı için kod bu satırı çalıştırırken
                                                 // java hata verir.                                          // verir.

    //    System.out.println(arraylist.size()); // Array in boyunu buuyoruz.

     //     arraylist.remove("Metallica");  bu index i çıkar demek.

     //     arraylist.remove(1);   // 1. index i çıkar.



    /*    for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

     */

     //   System.out.println(arraylist.indexOf("Metallica"));  // Metallica nın yerini öğreniyoruz.
                                                            // 0. index te bulunuyor.

     //   System.out.println(arraylist.lastIndexOf("Metallica"));  // 2. Metallica nın yerini öğrenme.

     //   System.out.println(arraylist.lastIndexOf("Dream Theater"));  // Olmayan bir yer aratınca
                                                                        // -1 değerini veriyor

     /*   arraylist.set(4,"Megadeth");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

      */

        yazdir(arraylist);












    }
}
