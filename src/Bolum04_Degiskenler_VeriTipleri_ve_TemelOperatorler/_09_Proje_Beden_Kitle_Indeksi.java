package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _09_Proje_Beden_Kitle_Indeksi {

    public static void main(String[] args) {

        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kite İndeksi = Kilo / Boy(m) * Boy(m)

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Beden Kitle İndeksi Hesaplama");

        System.out.print("Kilonuzu Girin: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu Girin (Örnek:1,75) : ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz: " + bki);

    }
}
