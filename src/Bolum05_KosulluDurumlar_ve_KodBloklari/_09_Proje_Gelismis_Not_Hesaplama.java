package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _09_Proje_Gelismis_Not_Hesaplama {

    public static void main(String[] args) {

        /*
        Kullanıcıdan Vize1, Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın.
        Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,
        DD alma ve ortalamanın 2.50'nin altında olma koşuluna göre ekrana bir yavsiye mesajı yazdırın.

        Vize1 toplam notun %30'una etki edecek.
        Vize2 toplam notun %30'una etki edecek.
        Final toplam notun %40'ına etki edecek.

        Toplam Not >= 90 --------------> AA
        Toplam Not >= 85 --------------> BA
        Toplam Not >= 80 --------------> BB
        Toplam Not >= 75 --------------> CB
        Toplam Not >= 70 --------------> CC
        Toplam Not >= 65 --------------> DC
        Toplam Not >= 60 --------------> DD
        Toplam Not >= 55 --------------> FD
        Toplam Not < 55 ---------------> FF
         */

        Scanner scanner = new Scanner(System.in);
        int vize1;
        int vize2;
        int fin;
        double genort;
        double topnot;

        System.out.print("Birinci vize notunuzu girin: ");
        vize1 = scanner.nextInt();

        System.out.print("İkinci vize notunuzu girin: ");
        vize2 = scanner.nextInt();

        System.out.print("Final notunuzu girin: ");
        fin = scanner.nextInt();

        System.out.print("Okul genel ortalamanızı girin: ");
        genort = scanner.nextDouble();

        topnot = (vize1 * 0.3) + (vize2 * 0.3) + (fin * 0.4);

        if (topnot >= 90) {
            System.out.println("AA aldınız...");
        }

        else if (topnot >= 85) {
            System.out.println("BA aldınız...");
        }

        else if (topnot >= 80) {
            System.out.println("BB aldınız...");
        }

        else if (topnot >= 75) {
            System.out.println("CB aldınız...");
        }

        else if (topnot >= 70) {
            System.out.println("CC aldınız...");
        }

        else if (topnot >= 65) {
            System.out.println("DC aldınız...");
        }

        else if (topnot >= 60 && genort < 2.50) {
            System.out.println("DD aldınız" + " ve Genel Ortalamanız: " + genort);
            System.out.println("Genel ortalamanız 2,50'nin altında olduğu için bu dersi tekrar almayı düşünebilirsiniz....");
        }

        else if (topnot >= 55) {
            System.out.println("FD aldınız ve Kaldınız...");
        }

        else {
            System.out.println("FF aldınız ve Kaldınız...");
        }



    }
}
