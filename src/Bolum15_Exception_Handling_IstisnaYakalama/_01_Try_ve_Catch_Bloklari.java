package Bolum15_Exception_Handling_IstisnaYakalama;

public class _01_Try_ve_Catch_Bloklari {

    public static void main(String[] args) {
        /*
        try {
            // Exception Oluşturabilecek Kodlar
        }

        catch (Exception_Türü e) {
            // Exception Durumunda Yapılacak İşlemler
        }

         */


   //     int a = 30 / 0;  // ArithmeticException  -->  Unchecked Exception

   //     int[] a = {1,2,3,4,5};
   //     System.out.println(a[6]); // ArrayIndexOutOfBoundsException   -->  Unchecked Exception

   //     System.out.println("Burası çalışıyor...");

/*
        try {
            int a = 30 / 0; // ArithmeticException
        }
        catch (ArithmeticException e) {

            System.out.println("Bir sayı 0'a bölünemez...");
        }

 */

/*
        try {
            int a = 30 / 0; // ArithmeticException
        }
        catch (Exception e) {  // Üst Class

            System.out.println("Bir sayı 0'a bölünemez...");
        }

 */

  /*

        try {
            int[] a = {1,2,3,4,5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Arrayin boyunu aştınız...");
        }

        System.out.println("Burası Çalışıyor....");

   */
/*
        try {
            int[] a = {1,2,3,4,5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }

        catch (IndexOutOfBoundsException e) {  // Üst Class

            System.out.println("Arrayin boyunu aştınız...");

            e.printStackTrace(); // Ne hatası olduğunu veriyor. kırmızı yazan bölüm
        }

        System.out.println("Burası Çalışıyor....");

 */
/*
        try {
            int[] a = {1,2,3,4,5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException

            int b = 30 / 0;  // ArithmeticException
        }

        catch (Exception e) {  // Üst Class --> Genel yazdık. Hepsini yakalıyor.

            System.out.println("Bir hata oluştu...");
            e.printStackTrace(); // ilk sıradaki hatanın adını verir.

        }

        System.out.println("Burası Çalışıyor....");

 */

        try {

            int b = 30 / 0;   // ArithmeticException

            int[] a = {1,2,3,4,5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException


        }

        catch (ArithmeticException e) {  // Üst Class --> Genel yazdık. Hepsini yakalıyor.

            System.out.println("Bir sayı 0'a bölünemez...");

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Arrayin boyunu aştınız...");
        }

        catch (Exception e) { // Genel Class yani Üst Class olduğu için en altta yeralmak zorunda.
                              // Genel olanı en üste yazsaydık hata verirdi.
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();

        }

        System.out.println("Burası Çalışıyor....");







    }
}
