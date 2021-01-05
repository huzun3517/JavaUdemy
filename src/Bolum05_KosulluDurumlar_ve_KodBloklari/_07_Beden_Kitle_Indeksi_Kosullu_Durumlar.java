package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _07_Beden_Kitle_Indeksi_Kosullu_Durumlar {

    public static void main(String[] args) {

        /*
        Kullanıcıdn alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve şu kurallara
        göre ekrana yazdırın

        Beden Kitle Indeksi = Kilo / Boy(m) * Boy(m)

        BKİ 18.5'un altındaysa -----------> Zayıf
        BKİ 18.5 ie 25 arasındaysa -------> Normal
        BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu
        BKİ 30'un üstündeyse -------------> Obez

         */

        Scanner scanner = new Scanner(System.in);
        int kilo;
        double boy;
        double bki;

        System.out.print("Kilonuz: ");
        kilo = scanner.nextInt();

        System.out.print("Boyunuz (Örnek:1,85): ");
        boy = scanner.nextDouble();

        bki = kilo / (boy * boy);
        System.out.println("Beden kitle indeksi: " + bki);

        if (bki < 18.5) {
            System.out.println("Zayıf");
        }

        else if (bki >=18.5 && bki < 25) {
            System.out.println("Normal");
        }

        else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla Kilolu");
        }

        else {
            System.out.println("Obez");
        }

    }
}
