package Bolum06_Donguler_ve_KararYapilari;

import java.util.Scanner;

public class _01_For_donguleri {

    public static void main(String[] args) {

        /*

        for (baslatma; kosul; artırma veya azaltma işlemleri) {
        Döngü koşulumuz doğru olduğu sürece burası çalışacak.
        }

        */

        /*

        int i;

        for (i = 0; i < 5; i++) {

            System.out.println("i = " + i);

       */

        /*

        for (int i = 0; i < 5; i++ ) {
            System.out.println("i = " + i);

            */

        /*

        for (int i =10; i > 0; i--) {
            System.out.println("i= " + i);

         */

        /*

        int i = 0;

        for (; i < 5; i++){
            System.out.println("Java Öğreniyorum...");

         */

        /*

        int i = 0;
        int j = 10;

        for (; i < 10 && j > 0; i++,j--){
            System.out.println("i = " + i);
            System.out.println("j = " + j);

         */

        /*

        for (int i = 2; i < 100; i *= 2) {
            System.out.println("i = " + i);

         */

        // Faktoriyel Hesaplama

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++){

            faktoriyel *= i; // faktoriyel = faktoriyel * i;
            System.out.println("Faktoriyel = " + faktoriyel + " i = " + i);

        }

        System.out.println("Faktoriyel= " + faktoriyel);



    }

}

