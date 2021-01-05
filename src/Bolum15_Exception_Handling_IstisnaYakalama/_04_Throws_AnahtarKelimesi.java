package Bolum15_Exception_Handling_IstisnaYakalama;

import java.io.IOException;
import java.util.Scanner;

public class _04_Throws_AnahtarKelimesi {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();


      try {
          mekanKontrol(yas); // main de kontrole alarak hatayı yakalıyoruz...
      }

      catch (IOException e){  // hangi hatayı verdirdiysek metodda burada onu kullanıyoruz.
          System.out.println("IOException oluştu...");
      }



    }

    public static void mekanKontrol(int yas) throws IOException {

        if (yas < 18) {
            throw new IOException(); // Checked Exception verdirdik. Bu yüzden metodda "throws"
                                    // anahtar kelimesini kullanmak zorundayım. Yoksa hata verir.
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }

    }
}
