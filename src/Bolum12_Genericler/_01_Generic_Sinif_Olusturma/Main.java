package Bolum12_Genericler._01_Generic_Sinif_Olusturma;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//      TODO Generic Classlar --> Türden bağımsız işlem yaptığımız metodlar veya class lardır.

 /*     toplama(3,4,5);

        toplama("String",4,5); --> tüm değerler int tanımlı olduğu için birine String değeri verince hata veriyor.


        ArrayList<String>arrayList1 = new ArrayList<>();

        ArrayList<Integer>arrayList2 = new ArrayList<Integer>();

  */

        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] string_dizi = {"Java","Python","C++","Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};

        CharYazdir.yazdir(char_dizi);
        System.out.println("**********************************");

        IntegerYazdir.yazdir(integer_dizi);
        System.out.println("**********************************");

        StringYazdir.yazdir(string_dizi);
        System.out.println("**********************************");

        OgrenciYazdir.yazdir(ogrenci_dizi);
        System.out.println("**********************************");


        System.out.println("********************************************************************");

        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("**********************************");

        yazdir_string.yazdir(string_dizi);
        System.out.println("**********************************");

        yazdir_int.yazdir(integer_dizi);
        System.out.println("**********************************");

        yazdir_ogrenci.yazdir(ogrenci_dizi);
        System.out.println("**********************************");





    }

    public static void toplama(int a, int b, int c){

        System.out.println(a + b + c);

    }
}
