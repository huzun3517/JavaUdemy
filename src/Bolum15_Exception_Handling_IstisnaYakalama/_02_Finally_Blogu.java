package Bolum15_Exception_Handling_IstisnaYakalama;

public class _02_Finally_Blogu {

    public static void main(String[] args) {
/*
        try {
            String s = null;

            System.out.println(s.hashCode());
        }

        catch (NullPointerException e) {

            System.out.println("Null Referans Hatası...");
        }

        finally {
            System.out.println("Finally bloğu çalışıyor..."); // Her durumda çalışıyor.
        }

 */
/*

        try {
            String s = "Mustafa";

            System.out.println(s.hashCode());
        }

        catch (NullPointerException e) {

            System.out.println("Null Referans Hatası...");
        }

        finally {
            System.out.println("Finally bloğu çalışıyor..."); // Her durumda çalışıyor.
        }

 */
/*
        try {
            int a = 30 / 0; // catch bloğunda bu hatayı yakalamadık.
                            // Hatayı verecek fakat Finally çalışacak ve program sonlanacak.
                            // Eğer programın sonlanmasını istemiyorsak hatayı yakalamalıyız.
        }

        catch (NullPointerException e) {

            System.out.println("Null Referans Hatası...");
        }

        finally {
            System.out.println("Finally bloğu çalışıyor..."); // Her durumda çalışıyor.
        }

        System.out.println("Burası çalışıyor...."); // Burayı yazmaz çünkü hatayı yakalamadık.

 */

        try {
            int a = 30 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }

        catch (NullPointerException e) {

            System.out.println("Null Referans Hatası...");
        }

        finally {
            System.out.println("Finally bloğu çalışıyor..."); // Her durumda çalışıyor.
        }

        System.out.println("Burası çalışıyor...."); // Şimdi çalışır. Çünkü hatayı yakaladık.






    }
}
