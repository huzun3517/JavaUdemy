package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._07_Final_Anahtar_Kelimesi;

public class FinalTest {

    public final int obje_sayisi;

    private static int say = 0;
    private final String isim;

    public FinalTest(String isim) {
        this.isim = isim;
        say++;
        obje_sayisi = say;
    }

    public int getObje_sayisi() {
        return obje_sayisi;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }

    public String getIsim() {
        return isim;
    }

    public void deneme(){

     //   obje_sayisi = 5; // bu değeri ya Constructor içinde yada en başta vermemiz gerekiyor.


    }


}
