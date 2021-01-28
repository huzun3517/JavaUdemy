package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._05_AccessModifier.Paket2;

public class Main2 {

    public static void main(String[] args) {

        ArabaPublicClass araba = new ArabaPublicClass();

        System.out.println(araba.model); // public olduğu için aynı paketten de ulaşabildik.
        System.out.println(araba.renk);
        System.out.println(araba.yil);

        System.out.println("***********************");

        System.out.println(araba.model3);
        System.out.println(araba.renk3);
        System.out.println(araba.yil3);
        // ArabaPublicClass ın içindeki değişkenler default olduğu için ve bu mainde aynı pakette olduğu için burada erişebildik.

        Hayvan hayvan = new Hayvan("Hayvan");
        System.out.println(hayvan.isim);// Aynı paketin içinde protected olan bir değişkene ulaşabiliyoruz.
    }
}
