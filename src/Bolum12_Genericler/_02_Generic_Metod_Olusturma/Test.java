package Bolum12_Genericler._02_Generic_Metod_Olusturma;

import Bolum12_Genericler._01_Generic_Sinif_Olusturma.Ogrenci;

public class Test {

    public static void main(String[] args) {

        /*
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] string_dizi = {"Java","Python","C++","Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};

        yazdir(char_dizi);
        System.out.println("*********************");
        yazdir(integer_dizi);
        System.out.println("*********************");
        yazdir(string_dizi);
        System.out.println("*********************");
        yazdir(ogrenci_dizi);
    }

    public static <E> void yazdir(E[] dizi){

        for (E e : dizi){

            System.out.println(e);
        }

         */

        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(25,45,2,35);

        Sayisal birinci = birinci(sayisal1,sayisal2);
        System.out.println("Birinci Sayısal Öğrencinin Puanı: " + birinci.puanHesapla());


        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40,10,50,0);

   //   EsitAgirlik birinci2 = birinci(esitAgirlik1,esitAgirlik2);  ilk methodda Generic yazmadığımız için burada hata verdi.

       
        EsitAgirlik birinci2 = birinciGeneric(esitAgirlik1,esitAgirlik2);
        System.out.println("Birinci Eşitağırlık Öğrencinin Puanı: " + birinci2.puanHesapla());




    }

    // Generic Olmayan Method
    public static Sayisal birinci(Sayisal s1, Sayisal s2){

        if (s1.puanHesapla() > s2.puanHesapla()){
            return s1;
        }

        else {
            return s2;
        }
    }

        // Generic Method
    public static <E extends Aday> E birinciGeneric(E e1, E e2){

        if (e1.puanHesapla() > e2.puanHesapla()){
            return e1;
        }

        else {
            return e2;
        }

    }
}
