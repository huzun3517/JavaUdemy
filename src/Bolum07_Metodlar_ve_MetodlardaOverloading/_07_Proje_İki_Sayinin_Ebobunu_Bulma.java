package Bolum07_Metodlar_ve_MetodlardaOverloading;

import java.util.Scanner;

public class _07_Proje_İki_Sayinin_Ebobunu_Bulma {

    public static int EbobBulma(int sayi1, int sayi2) {

        int ebob = 1;

        for (int i =1; i <= sayi1 && i <= sayi2; i++) {

            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {

                ebob = i;

            }

        }
        return ebob;
    }

    public static void main(String[] args) {

        // Kullanıcıdan alınan 2 sayının Ebobunu bulma.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayı: ");
        int sayi2 = scanner.nextInt();

        System.out.println("İki sayının ebobu: " + EbobBulma(sayi1,sayi2));



    }
}
