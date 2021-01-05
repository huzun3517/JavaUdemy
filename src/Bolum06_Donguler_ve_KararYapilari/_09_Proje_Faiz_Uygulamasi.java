package Bolum06_Donguler_ve_KararYapilari;

import java.util.Scanner;

public class _09_Proje_Faiz_Uygulamasi {

    public static void main(String[] args) {

         /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("Bankamıza hoş geldiniz.Faiz oranı %6");

        int anapara;
        int vade;

        System.out.print("Faize yatırmak istediğiniz Para: ");
        anapara = scanner.nextInt();

        System.out.print("Kaç yıl vadeli yatırıyorsunuz: ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizoranı = 0.06;

        for (int i = 1; i <= vade; i++){

            toplampara = (toplampara * faizoranı) + toplampara;

            System.out.println(i + " yılın sonunda toplam para : " + (int) toplampara);

        }


    }
}
