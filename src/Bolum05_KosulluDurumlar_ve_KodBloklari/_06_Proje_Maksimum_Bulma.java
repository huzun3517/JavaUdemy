package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _06_Proje_Maksimum_Bulma {

    public static void main(String[] args) {

        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int max;
        int min;

        System.out.print("1.Sayıyı girin: ");
        a = scanner.nextInt();

        System.out.print("2.Sayıyı girin: ");
        b = scanner.nextInt();

        System.out.print("3.Sayıyı girin: ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            max = a;
        }

        else if (b > a && b > c) {
            max = b;
        }

        else {
            max =c;
        }

        System.out.println("Maksimum Sayı: " + max);

    }

}
