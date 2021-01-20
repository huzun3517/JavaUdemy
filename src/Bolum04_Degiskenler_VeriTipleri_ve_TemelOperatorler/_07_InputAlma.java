package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _07_InputAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Alt + Enter ile dahil ederek hatayı önleyebiliriz.

        /*

        System.out.print("Lütfen Yaşınızı Girin: "); // println yerine print yazınca alt satıra geçmeden yanına yazılır.

        int yas = scanner.nextInt();

        System.out.println("Yaşınız: " + yas);



        System.out.print("Lütfen sayı giriniz: ");

        double sayi = scanner.nextDouble();  // Ondalık sayı girerken virgül kullanmalıyız. Java bu şekilde algılıyor.

        System.out.println("Sayı: " + sayi);



        System.out.println("Lütfen bir yazı giriniz: ");

        String yazi = scanner.nextLine();

        System.out.println("Yazı: " + yazi);



        System.out.println("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();  // nextInt() sayı girişleri için kullanılır. Buraya String değeri girersek hata verir.

        System.out.println("Sayı: " + sayi);

         */

        System.out.print("Bir sayı giriniz: ");

        if (scanner.hasNextInt()) {

            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }

        else {
            System.out.println("Lütfen bir sayı değeri giriniz...!");
        }

    }
}
