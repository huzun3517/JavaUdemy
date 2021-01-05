package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._07_Proje_Idman_Programi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // İdman Oluşturma Programı

        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman Programına Hoşgeldiniz...");
        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                + "Pushup(Şınav)\n"
                + "Situp(Mekik)\n"
                + "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.print("Burpee Sayısı: ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup Sayısı: ");
        int pushup = scanner.nextInt();

        System.out.print("Situp Sayısı: ");
        int situp = scanner.nextInt();

        System.out.print("Squat Sayısı: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız Başlıyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaçtane yapacaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.haraketYap(tur,sayi);
        }

        System.out.println("İdmanını başarıyla bitirdin...");



    }
}
