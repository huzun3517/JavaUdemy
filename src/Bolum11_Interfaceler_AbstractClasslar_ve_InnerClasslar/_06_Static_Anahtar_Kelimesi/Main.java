package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._06_Static_Anahtar_Kelimesi;

public class Main {

    public static void main(String[] args) {
/*      TODO
          main methodu neden static tir. static kısmını kaldırırsak ne olur.
          Java projelerinin çalışması için bellekte oluşturulması gerekiyor. Eğer main static olmazsa bu bellekte
          oluşturulamayacağı için run dediğimizde programımız çalışmayacaktır. */

/*
        Seyirci seyirci1 = new Seyirci("Oğuz Artıran");
        Seyirci seyirci2 = new Seyirci("Mustafa Murat Coşkun Artıran");

        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayısı: " + Seyirci.seyirci_sayisi);
        System.out.println("Seyirci Sayısı: " + seyirci1.seyirci_sayisi);
        System.out.println("Seyirci Sayısı: " + seyirci2.seyirci_sayisi);
*/

        Seyirci seyirci1 = new Seyirci("Oğuz Artıran");
        Seyirci seyirci2 = new Seyirci("Mustafa Murat Coşkun Artıran");

        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayısı: " + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci Sayısı: " + seyirci1.getSeyirci_sayisi());
        System.out.println("Seyirci Sayısı: " + seyirci2.getSeyirci_sayisi());

 //       selamla();  // todo Static bir methoddan static olmayan bir methodu direk olarak çağıramazsın.
//                            Çünkü main methodu static.

          selamla(); // burda çağırabildik. Çünkü aşağıdaki methodu static hale getirdik.

        System.out.println(Math.PI); // Math fonksiyonu static olarak yazıldığı için burada kullanabiliyoruz.

    }

    /*
    public  void selamla() {

        System.out.println("Selamlar....");
    }
     */

    public static void selamla() {

        System.out.println("Selamlar....");
    }
}
