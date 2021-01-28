package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._07_Final_Anahtar_Kelimesi;

public class Main {

    public static void main(String[] args) {

        FinalTest f1 = new FinalTest("Obje1");
        FinalTest f2 = new FinalTest("Obje2");

        System.out.println("Obje Sayısı: " + f1.obje_sayisi);
        System.out.println("Obje Sayısı: " + f2.obje_sayisi);

//      f2.obje_sayisi = 10; // obje sayısı değişkeni final tanımlı olduğu için tekrar değiştiremiyoruz.

        System.out.println(Math.PI);

//      Math.PI = 3.5; // Bu Math kütüphanesinde final olarak tanımlı olduğu için değiştiremiyoruz.


        System.out.println("********************");

        System.out.println("Database İsmi : " + Database.databaseIsmi);
        System.out.println("UserName : " + Database.userName);
        System.out.println("Password : " + Database.password);

   //   Database.userName = "root2"; // final tanımlı olduğundan değeri değiştiremeyiz. Güvenlik için önemli






    }
}
