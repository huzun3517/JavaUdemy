package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._10_LinkedList1;

import java.util.ArrayList;

public class LinkedList1 {

    public static void main(String[] args) {

        ArrayList<String>diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");

       /* for (int i =0; i < diller.size(); i++) {
            System.out.println(diller.get(i));
        }

        */
        //foreach
        for (String s : diller) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        diller.add(1,"C++");
        for (String s: diller
             ) {
            System.out.println(s);
        }
    }
}