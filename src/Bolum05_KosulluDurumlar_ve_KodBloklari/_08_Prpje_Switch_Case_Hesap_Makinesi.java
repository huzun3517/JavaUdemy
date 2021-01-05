package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _08_Prpje_Switch_Case_Hesap_Makinesi {

    public static void main(String[] args) {

        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın

        System.out.println("************************");
        System.out.println("Hesap Makinesi");
        System.out.println("1.İşlem: Toplama");
        System.out.println("2.İşlem: Çıkarma");
        System.out.println("3.İşlem: Çarpma");
        System.out.println("4.İşlem: Bölme");
        System.out.println("************************");

        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;

        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        String islem = scanner.nextLine();

        switch (islem){
            case "1":
                System.out.print("Birinci sayı: ");
                sayi1 = scanner.nextInt();

                System.out.print("İkinci sayı: ");
                sayi2 = scanner.nextInt();

                int toplam = sayi1 + sayi2;

                System.out.println("Toplam= " + toplam);
                break;

            case "2":
                System.out.print("Birinci sayı: ");
                sayi1 = scanner.nextInt();

                System.out.print("İkinci sayı: ");
                sayi2 = scanner.nextInt();

                int fark = sayi1 - sayi2;
                System.out.println("Fark= " + fark);
                break;

            case "3":
                System.out.print("Birinci sayı: ");
                sayi1 = scanner.nextInt();

                System.out.print("İkinci sayı: ");
                sayi2 = scanner.nextInt();

                int carpim = sayi1 * sayi2;
                System.out.println("Çarpım= " + carpim);
                break;

            case "4":
                System.out.print("Birinci sayı: ");
                sayi1 = scanner.nextInt();

                System.out.print("İkinci sayı: ");
                sayi2 = scanner.nextInt();

                double bolum = sayi1 / (double)sayi2;
                System.out.println("Bölüm= " + bolum);
                break;

            default:
                System.out.println("Yanlış giriş yaptınız...");

        }



    }


}


