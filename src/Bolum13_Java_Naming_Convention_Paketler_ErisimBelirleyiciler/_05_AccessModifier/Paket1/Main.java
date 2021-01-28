package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._05_AccessModifier.Paket1;

import Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._05_AccessModifier.Paket2.*;
                            // Paket2.* -->P Paket2 nin içindeki herşeye ulaş.
public class Main {

     /*
    Access Modifiers- Erişim Belirleyiciler

    Erişim Belirleyiciler 2 düzeyde erişimi belirlerler.

    Sınıf Düzeyinde Erişim Belirleyiciler

    public : Bir class eğer public yazılmışsa bu classa paketin içindeki ve paketin dışındaki
    tüm classlar tarafından erişilir.

    default: default erişim belirleyici kullanmamak anlamına gelir.
    Eğer bir class hiçbir erişim belirleyici kullanmadan yazılmışsa, bu class'a sadece aynı paketin içindeki
    classlar erişebilir. Paketin dışındaki classlar bu class'a erişemez.

    *** protected, private erişim belirleyiciler classlar için kullanılamazlar.


    Metod ve Özellik Düzeyinde Erişim Belirleyiciler


    public: Eğer bir metod veya özellik(class member veya alan) public olarak tanımlanmışsa ,
    bu alana paketin içindeki ve dışındaki tüm classlar erişebilir.
    Ancak tabii ki bu alanın içinde bulunduğu classın da erişilebilir olması gerekir.

    default: Eğer bir metod veya özellik tanımlanırken hiçbir erişim belirleyici kullanılmamışsa (default),
    bu alana sadece kendi paketindeki classlar erişebilir.

    protected : Eğer bir metod veya özellik(class member veya alan) protected olarak tanımlanmışsa,
    bu alana aynı paketin içindeki diğer classlar tarafından erişilebilir. Paketin dışındaki classlar ise
    sadece ve sadece bu alanın bulunduğu classın bir alt classıysa erişebilir.

    private: Eğer bir alan private olarak tanımlanmışsa bu alana sadece kendi classı erişebilir.


    Daha önceden öğrendiğimiz gibi bir metodun içinde tanımlanmış değişkenler lokal değişken olarak tanımlanırlar.Yani,
    bu değişkenlere diğer metodlardan ve classlardan erişilemez. Bundan dolayı bu değişkenlere access modifier eklenemez.

 */


    public static void main(String[] args) {

        ArabaPublicClass araba = new ArabaPublicClass();

   //     ArabaDefault araba2 = new ArabaDefault();  Default olarak oluşturulmuş Class a farklı paketten ulaşamadık.

        System.out.println(araba.model); // publik olduğu için diğer pakete ulaşabildim.
        System.out.println(araba.renk);
        System.out.println(araba.yil);

        System.out.println("**************************");
/*
        System.out.println(araba.model2); // public class ın içindeki değişkenler private olduğu için erişemedik.
        System.out.println(araba.renk2);
        System.out.println(araba.yil2);

 */
        System.out.println("**************************");
/*
        System.out.println(araba.model3);
        System.out.println(araba.renk3);
        System.out.println(araba.yil3);
        // ArabaPublicClass ın içindeki değişkenler default olduğu için ve bu mainde farklı pakette olduğu için burada erişemiyoruz.
 */

        Hayvan hayvan = new Hayvan("Hayvan");
 //     System.out.println(hayvan.isim); Farklı paketlerde protected değişkene ulaşamıyoruz.








    }
}
