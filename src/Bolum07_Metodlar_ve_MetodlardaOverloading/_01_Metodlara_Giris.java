package Bolum07_Metodlar_ve_MetodlardaOverloading;

import java.util.Scanner;

public class _01_Metodlara_Giris {

    //selamlama adinda bir metod yazdik.
    public  static void selamlama() {

        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar... ?");
    }

    // faktoriyel adında bir metod yazdık. faktoriyel hesabı yapıyor.
    public static void faktoriyel(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");

        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel = faktoriyel * sayi;
            sayi--;
        }
        System.out.println("Sayının faktoriyeli= " + faktoriyel);


    }

    public static void main(String[] args) {

        /*
        Erisim_Belirleyici(Opsiyonel) Ekstra_Ozellikler Donus_Tipi Fonksiyon_Adi(Parametreler) {
        // Burasi Fonksiyon Blogu

        // Fonksiyonun yapacagi islemler burada olacak.

        }

         */

        selamlama(); // selamlama metodunu çağırdık.

        faktoriyel(); // faktoriyel metodunu çağırdık




    }


}
