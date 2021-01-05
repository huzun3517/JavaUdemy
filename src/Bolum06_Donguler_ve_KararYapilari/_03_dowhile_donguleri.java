package Bolum06_Donguler_ve_KararYapilari;

import java.util.Scanner;

public class _03_dowhile_donguleri {

    public static void main(String[] args) {
        /*

        do {
                Koşul doğru olduğu sürece
                While dan farkı en az bir kere çalışmasının garanti olması.

           }
           while(koşul);

         */

        /*

        int i = 0;

        do {
            System.out.println("i = " + i);
            i++;

        }while (i < 5);

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;
            System.out.println("Sayı: " + sayi);

        }while (sayi > 0);

        System.out.println("Sayının rakamları toplamı= " + toplam);


    }
}
