package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._06_Static_Anahtar_Kelimesi;

public class Main {

    public static void main(String[] args) {

        StaticClass s1 = new StaticClass("Hüseyin");
        StaticClass s2 = new StaticClass("Şenay");

        System.out.println("Obje Sayısı: " + StaticClass.obje_sayisi);
        System.out.println("Obje Sayısı: " + s1.obje_sayisi);
        System.out.println("Obje Sayısı: " + s2.obje_sayisi);

        System.out.println("***********************");

    //  toplama(3,4,5); // Static olan method içinde static olmayan method çağıramayız.

        toplamaStatic(3,4,5);

    }

    public void toplama(int a, int b, int c){

        System.out.println(a + b + c);
    }

    public static void toplamaStatic(int a, int b, int c){

        System.out.println(a + b + c);
    }
}
