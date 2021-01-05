package Bolum15_Exception_Handling_IstisnaYakalama._06_Kendi_Exception_Classimiz;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı girin: ");
        int yas = scanner.nextInt();

        try {
            mekanKontrol(yas);
        }

        catch (InvalidAgeException e) {
            e.printStackTrace(); // Diğer Class oluşturduğum @Override printStackTrace() içinde
                                 // yazan hatayı ekrana getiriyor.

            //     System.out.println(e); --> deseydim "Invalid Age" hata ekrana gelecekti.
        }


    }

    public static void mekanKontrol (int yas) {

        if (yas < 18) {

            throw new InvalidAgeException("Invalid Age");
        }

        else {
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
}
