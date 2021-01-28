package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._05_AccessModifier.Paket1;

import Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._05_AccessModifier.Paket2.Hayvan;

public class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    public void isminiSoyle(){
        System.out.println(super.isim); // extends edilen classda farklı paketlerde de olsa protected değişkene ulaşabiliyoruz.
    }

}
