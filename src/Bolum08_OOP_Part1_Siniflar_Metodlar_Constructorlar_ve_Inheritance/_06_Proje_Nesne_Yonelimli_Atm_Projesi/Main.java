package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._06_Proje_Nesne_Yonelimli_Atm_Projesi;

public class Main {

    public static void main(String[] args) {

        // Object Oriented(Nesne Yönelimli ) ATM Programı

        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.

        // Hesap Class'ı Hesap İşlemlerini Yapacak.

        // ATM ise atmmizi çalıştıracak.

        ATM atm = new ATM();

        Hesap hesap = new Hesap("Ömer Faruk","1453",2000);

        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");


    }

    
}
