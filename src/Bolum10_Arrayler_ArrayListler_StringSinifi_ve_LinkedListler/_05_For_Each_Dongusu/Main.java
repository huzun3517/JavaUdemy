package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._05_For_Each_Dongusu;

public class Main {

    public static void main(String[] args) {

        String[] array = {"Elma", "Armut","Kiraz"};

    /*    for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

     */

    /*    for (String a: array) {
            System.out.println(a);
        }

     */

     /*   int[] array2 = {1,2,3,4,5,6,7};

        for (int i: array2) {
            System.out.println(i);
        }

      */

        Deneme[] array3 = {new Deneme("Mustafa"),new Deneme("Murat"),new Deneme("Coşkun")};

        for (Deneme d: array3) {
            d.yaz();
        }


        

    }
}
