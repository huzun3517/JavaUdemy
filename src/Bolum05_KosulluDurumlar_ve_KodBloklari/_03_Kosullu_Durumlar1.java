package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _03_Kosullu_Durumlar1 {

    public static void main(String[] args) {
        /*
        if(koşul) {
            Koşul sağlanınca(true) bu blok çalışır.
            }

            else {
            Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
            }
         */

        Scanner scanner = new Scanner(System.in);

        /*

        System.out.print("Lütfen yaşınızı girin: ");
        int yas = scanner.nextInt();

        if (yas < 19) {
            System.out.println("Bu mekana giremezsiniz...");
        }

        else {
            System.out.println("Bu mekana girebilirsiniz...");
        }

         */

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif");
        }

        else {
            System.out.println("Pozitif veya Sıfır");
        }


    }
}
