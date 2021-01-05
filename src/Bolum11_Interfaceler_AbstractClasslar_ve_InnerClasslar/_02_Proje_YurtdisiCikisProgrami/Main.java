package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._02_Proje_YurtdisiCikisProgrami;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                + "15 TL harç bedeninizi tam olarak yatırmanız gerekiyor...\n"
                + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";

        String mesaj = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";

        while (true){
            System.out.println("***************************************");
            System.out.println(sartlar);
            System.out.println("***************************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol Ediliyor...");

            Thread.sleep(3000);
            if (yolcu.yurdisiHarciKontrol() == false) {

                System.out.println(mesaj);
                continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }

            System.out.println("İşlemleriniz Tamam ! Yurtdışına Çıkabilirsiniz...");
            break;

        }
    }
}
