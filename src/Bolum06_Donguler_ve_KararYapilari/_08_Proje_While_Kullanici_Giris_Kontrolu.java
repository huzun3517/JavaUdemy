package Bolum06_Donguler_ve_KararYapilari;

import java.util.Scanner;

public class _08_Proje_While_Kullanici_Giris_Kontrolu {

    public static void main(String[] args) {

        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.

        Scanner scanner = new Scanner(System.in);

        String sys_kullanici = "Hüseyin";
        String sys_parola = "1453";
        int giris_hakki = 3;

        System.out.println("***************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("***************************");

        while (true) {
            System.out.print("Kullanıcı adınızı girin: ");
            String kullanici = scanner.nextLine();

            System.out.print("Parolanızı girin: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println(" Hoşgeldiniz " + sys_kullanici);
                break;
            }

            else if (kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)) {
                System.out.println("Yanlış Parola...");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);

            }

            else if (!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println("Yanlış Kullanıcı Adı...");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }

            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }

            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız kalmadı. Tekrar bekleriz...");
                break;
            }





        }




    }
}
