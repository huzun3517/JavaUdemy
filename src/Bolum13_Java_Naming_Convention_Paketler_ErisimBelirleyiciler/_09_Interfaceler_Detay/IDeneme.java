package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._09_Interfaceler_Detay;

public interface IDeneme {

    public int a = 4;
//  private int b = 4; // Interface içinde private kullanılamaz.

 //   public int c; //  = ile değer atanmalı.

     public int c = 5;

    public static String deneme = "Deneme";

 //   public final int d; // tanımlama yapmayınca hata verir.

    public final int e = 6;

/*    public void deneme(){ // Interface de static olmayan gövdeli method oluşturamayız.

        System.out.println("Deneme");

    }

 */

    public static void deneme(){ // Interface de static olmayan gövdeli method oluşturamayız.

        System.out.println("Deneme");

    }








}
