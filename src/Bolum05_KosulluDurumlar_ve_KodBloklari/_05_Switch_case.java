package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _05_Switch_case {

    public static void main(String[] args) {

        /*
        switch(op) {
            case durum1:
                islemler
                 break

            case durum2:
                islemler
                break

            default:
                islemler
                break

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir işlem giriniz: ");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("1.işlem");
                break;
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }




    }
}
