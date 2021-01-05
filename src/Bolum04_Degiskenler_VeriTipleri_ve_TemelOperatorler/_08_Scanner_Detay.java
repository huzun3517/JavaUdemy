package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _08_Scanner_Detay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*

        int yas = scanner.nextInt(); // Yaş değeri girildikten sonra Enter a basınca nextLine değerini almadan
                                    // alt satıra geçiyor. Bunu önlemek için:

        scanner.nextLine();  // Dummy

        String isim = scanner.nextLine();

        System.out.println("Yaş : " + yas);

        System.out.println("İsim: " + isim);



        String isim = scanner.nextLine();  // NextLine dan sonra nextInt alınca problem olmuyor.

        int yas = scanner.nextInt();

        System.out.println("İsim: " + isim);

        System.out.println("Yaş : " + yas);

         */

        int yas1 = scanner.nextInt();  // yaş1 değerini girip Enter ile diğer imput almaya geçebiliriz.
        int yas2 = scanner.nextInt();   // yada Boşluk tuşuylada diğer imputalmaya geçebiliriz.
        int yas3 = scanner.nextInt();

        System.out.println("yas1: " + yas1 + " yas2: " + yas2 + " yas3: " + yas3);

        System.out.println("yas1: " + yas1      // \n ile alt satıra geçebiliriz.
                + "\nyas2: " + yas2
                + "\nyas3: " + yas3);

    }
}
