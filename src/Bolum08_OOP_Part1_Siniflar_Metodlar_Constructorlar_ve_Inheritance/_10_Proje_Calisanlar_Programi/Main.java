package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._10_Proje_Calisanlar_Programi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Çalışanlar Programı

        Çalışan Sınıfı Şeklinde Bir Üst Sınıf

        Çalışan Sınıfından Türeyen Yazılımcı adında Bir Alt Sınıf
        Çalışan Sınıfından Türeyen Yönetici adında Bir Alt Sınıf
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler = "İşlemler...\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşlemleri\n"
                +"Çıkış için q'ya basın";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");

        while (true) {
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Mustafa Murat","Coşkun",567,"Pyhton,c,Java");
                System.out.println("***************************************");
                String yazilimci_islem = "Yazılımcı işlemleri\n"
                                    + "1.Format At\n"
                                    + "2.Bilgileri Göster\n"
                                    + "3.Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                System.out.println("***************************************");

                while (true) {

                    System.out.print("İşlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");

                        break;
                    }

                    else if (y_islem.equals("1")) {

                        System.out.print("İşletim Sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }

                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }

                }


            }

            else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Serhat","Say",123,10);

                String yonetici_islem = "Yonetici işlemleri\n"
                                + "1. Zam Yap\n"
                                + "2. Bilgileri Göster\n"
                                + "Çıkış için q'ya basın";
                System.out.println("***************************************");
                System.out.println(yonetici_islem);
                System.out.println("***************************************");

                while (true) {
                    System.out.print("işlem Seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }

                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin nekadar zam yapmasını istiyorsun: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }

                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz İşlem...");
                    }


                }


            }

            else if (islem.equals("3")) {


            }


        }



    }
}
