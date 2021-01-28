package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._02_Paketler2.paket01;

import Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._02_Paketler2.paket02.AdayOgrenci;

public class Ogrenci implements AdayOgrenci {
    @Override
    public void ders_calis() {
        System.out.println("Ders çalışıyorum...");
    }
}
