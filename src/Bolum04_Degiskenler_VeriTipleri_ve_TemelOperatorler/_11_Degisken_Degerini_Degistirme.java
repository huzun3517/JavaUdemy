package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _11_Degisken_Degerini_Degistirme {

    public static void main(String[] args) {

        // Kullanıcıdan aldığınız iki sayının değerlerini değiştirin.

        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci Sayıyı Giriniz: ");
        birinci_sayi = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        ikinci_sayi = scanner.nextInt();

        System.out.println("Değiştirilmeden Önce...");
        System.out.println("Birinci Sayı: " + birinci_sayi + "  İkinci Sayı: " + ikinci_sayi);

        int gecici_sayi = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici_sayi;

        System.out.println("Değiştirildikten Sonra...");
        System.out.println("Birinci Sayı: " + birinci_sayi + "  İkinci Sayı: " + ikinci_sayi);


    }
}
