package Bolum06_Donguler_ve_KararYapilari;

public class _02_While_Donguleri {

    public static void main(String[] args) {

        /*

        while(döngü koşulu) {
                Koşul doğru olduğu sürece çalışır.
        }

         */

        /*

        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }

         */

        /*

        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

         /*

        int i = 10;

        while (i < 100) {
            System.out.println("i = " + i);
            i += 3;
        }

         */

        /*

        // Faktoriyel Hesaplama

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel= " + faktoriyel);

         */

        int i = 0;

        while (i < 10) {
            System.out.println("i = " + i);

            // i++ i yi artırmayı unuttuğumuz için sonsuz döngü oluşur. ya da

            //i-- i yi azaltma yaparsak da sonsuz döngü oluşur.
        }


    }
}
