package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._08_AutoboxingveUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

          /*
        Wrapper Class

        boolean ------> Boolean
        char ---------> Character
        byte ---------> Byte
        short --------> Short
        int ----------> Integer
        long ---------> Long
        float --------> Float
        double -------> Double

        */

        ArrayList<String>arrayList = new ArrayList<String>();

    //  ArrayList<int> arrayList2 = new ArrayList<int>(); // java hata verir. referans gönderilmesi
    //  gerekiyor. Fakat biz ilkel veri tipi gönderdik.

    //  ArrayList<double> arrayList2 = new ArrayList<double>(); // java hata verir.

    //  int a = 5; // a yı ilkel veri tipinde tanımladık.
    //  Integer a = 5; // ayı ilkel veri tipinde değil de bir sınıf şeklinde tanımladık.

    /*    ArrayList<Integer>arrayList2 = new ArrayList<Integer>();

        for (int i =0; i < 10; i++) {
            arrayList2.add(Integer.valueOf(i*4));  // Autoboxing
        }

        for (int i =0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i).intValue()); // Unboxing
        }

     */

        ArrayList<Integer>arrayList2 = new ArrayList<Integer>();

         for (int i =0; i < 10; i++) { // Autoboxing
            arrayList2.add(i*4);
        }

        for (int i =0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i)); // Unboxing arraylist2.get(i).intValue();
        }

    }
}
