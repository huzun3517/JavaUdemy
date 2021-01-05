package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._07_StaticOlmayanInnerClasslar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    TODO
        1.Statik Olmayan Inner Classlar
        2.Statik Inner Classlar
        3.Lokal (Yerel) Inner Classlar
        4.Anonymous (Anonim) Inner Classlar
 */

  //      Factoriyel factoriyel = new Factoriyel(); // hata
        // todo bu şekilde oluşturamayız. Çünkü Inner class san direk obje oluşturulamıyor.

//        Matematik.Factoriyel factoriyel = new Matematik.Factoriyel(); // hata
        // todo ilk önce Matematik.javayı oluşturmamaız lazım. Sonra Faktoriyel classından obje oluşturmalıyız.

        Matematik.Factoriyel factoriyel = new Matematik().new Factoriyel();

        Matematik.Asal asal = new Matematik().new Asal();

        Matematik.Alan alan = new Matematik().new Alan();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        if (asal.asal_mi(sayi)){
            System.out.println("Bu sayı Asaldır.");
        }
        else {
            System.out.println("Bu sayı Asal değildir...");
        }

        factoriyel.faktoriyel();

 //       alan.daire_alan(5);
//        public void daire_alan(int yaricap) bu method önce Alan Inner class ın içindeydi.
//        sonra bunu Alanın içine DaireAlan diye bir Inner class oluşturup methodu onun içine yazdım. hata verdi.
//        Çünkü Daire Alan diye bir obje oluşturup ordan methodu çağırmam lazım

        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
        daire_alan.daire_alan(5);








    }
}
