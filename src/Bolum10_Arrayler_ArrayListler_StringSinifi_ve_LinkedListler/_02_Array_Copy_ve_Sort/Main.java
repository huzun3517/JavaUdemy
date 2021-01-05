package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._02_Array_Copy_ve_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayi_bastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }

    public static void array_sort(int [] array) {

        // Arrays Sınıfını kullanarak sıralama yapmak

        Arrays.sort(array);
        arrayi_bastir(array);

    }



    public static void main(String[] args) {

    //    int [] a = arrayi_doldur(5);
    //    arrayi_bastir(a);

    //    array_sort(a);

        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};

    /*    if (a1 == a2) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit değiller.");
        }

     */

        if (Arrays.equals(a1,a2)) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit değiller.");
        }

    }
}
