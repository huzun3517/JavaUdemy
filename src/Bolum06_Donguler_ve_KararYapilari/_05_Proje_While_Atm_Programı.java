package Bolum06_Donguler_ve_KararYapilari;

import java.util.Scanner;

public class _05_Proje_While_Atm_Programı {

    public static void main(String[] args) {

        /*
        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış   : q
         */

        System.out.println("*****************************");
        System.out.println("ATM'ye Hoşgeldiniz...");

        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                + "2.İşlem : Para Çekme\n"
                + "3.İşlem : Para Yatırma\n"
                + "Çıkış   : q";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;

        Scanner scanner = new Scanner(System.in);




        while (true){

            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            }

            else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutarı girin: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();


                if (tutar <= bakiye){
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
                else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
            }

            else if (islem.equals("3")) {

                System.out.print("Yatırmak istediğiniz tutarı girin: ");

                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);

            }

            else {
                System.out.println("Geçersiz işlem...");
            }

        }




    }
}
