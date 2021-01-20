package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._06_Static_Anahtar_Kelimesi;

public class Seyirci {

//    private String isim;

    private static String isim;

//    public static int seyirci_sayisi = 0;//todo Public olduğu için ve static olduğu için direk class adıyla erişebildik.

    private static int seyirci_sayisi = 0;

    public Seyirci(String isim) {
        this.isim = isim;

        seyirci_sayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyun_seyret() {

        System.out.println(isim + " oyun seyrediyor...");
    }

    public static int getSeyirci_sayisi() {

//      System.out.println(isim); // todo yukarıdaki Statick olmayan field i static method içinde kullanamayız.

        System.out.println(isim); // todo yukarıdaki field i static yapınca kullanabiliriz.

        return seyirci_sayisi;

    }
}
