package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

import java.util.Scanner;

public class _12_Hipotenus_Bulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Dik Üçgenin Hipotenüsünü Bulma...");
        System.out.println("************************************");

        int a;
        int b;

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus: " + h );

    }
}
