package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _10_Proje_Yakit_Tutari {

    public static void main(String[] args) {

        /*
        Bir aracın kilometrede nekadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve sürücünün toplam
        ne kadar ödemesi gerektiğini hesaplayın.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Yol Ücreti Otomatına Hoşgeldiniz...");
        System.out.println("********************************************");

        System.out.print("Aracınız Kilometre'de Kaç Euro Yakıyor? (Örnek 1,25) : ");
        double kmucreti = scanner.nextDouble();

        System.out.print("Aracınızla Toplam Kaç km Yol Gittiniz? : ");
        int yol = scanner.nextInt();

        double toplamucret = kmucreti * yol;
        System.out.println("Toplam Ödemeniz Gereken Ücret: " + toplamucret + " Euro");

    }
}
