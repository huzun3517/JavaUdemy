package Bolum05_KosulluDurumlar_ve_KodBloklari;

import java.util.Scanner;

public class _04_Kosullu_Durumlar2 {

    public static void main(String[] args) {

        /*
        if(kosul){

        }

        else if(baska bir kosul){

        }

        else if(baska bir kosul){

        }

        else {

        }

         */

        Scanner scanner = new Scanner(System.in);

        /*

        System.out.print("Lütfen işlem giriniz: ");

        int islem = scanner.nextInt();

        if (islem == 1) {
            System.out.println("1.İşlem");
        }

        else if (islem == 2) {
            System.out.println("2.İşlem");
        }

        else if (islem == 3) {
            System.out.println("3.İşlem");
        }

        else if (islem == 4) {
            System.out.println("4.İşlem");
        }

        else {
            System.out.println("Geçersiz İşlem...");
        }

         */

        System.out.print("Lütfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("AA");
        }

        else if (not >= 85) {
            System.out.println("BA");
        }

        else if (not >= 80) {
            System.out.println("BB");
        }

        else if (not >= 75) {
            System.out.println("CB");
        }

        else if (not >= 70) {
            System.out.println("CC");
        }

        else if (not >= 65) {
            System.out.println("DC");
        }

        else if (not >= 60) {
            System.out.println("DD");
        }

        else {
            System.out.println("Dersten kaldınız...");
        }


    }
}
