package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._05_Proje_GeometrikSekilHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler...\n"
                + "1.Kare Alan Hesapla\n"
                + "2.Üçgen Alan Hesapla\n"
                + "3.Daire Alan Hesapla\n"
                + "Çıkış : q";

        while (true) {
            System.out.println("*****************************");
            System.out.println(islemler);
            System.out.println("*****************************");
            System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz: ");
            String sekil_turu = scanner.nextLine();

            Sekil sekil = null;

            if (sekil_turu.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1",kenar);
                // todo Sekil Abstract classı referans alındı. Yani Polimorphism uygulanmış oldu.
                // todo Burada sekil Kare gibi davranıyor.

                sekil.alanHesapla();

            }

            else if (sekil_turu.equals("2")) {
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Üçgen1",kenar1,kenar2,kenar3);
                // todo Burada sekil Üçgen gibi davranıyor.

                sekil.alanHesapla();

            }

            else if (sekil_turu.equals("3")) {
                System.out.print("Dairenin yarıçapı: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire 1",yaricap);
                // todo Burada sekil Daire gibi davranıyor.

                sekil.alanHesapla();
            }

            else {
                System.out.println("Geçersiz işlem...");
            }


        }
    }
}
