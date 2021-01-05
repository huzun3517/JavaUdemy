package Bolum07_Metodlar_ve_MetodlardaOverloading;

import java.util.Scanner;

public class _08_Proje_Method_Overloading_Hesap_Makinesi {

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b){
        return ((double)a / b);
    }

    public static int toplama(int a, int b){
        return (a + b);
    }

    public static int toplama(int a, int b, int c){
        return (a + b + c);
    }

    public static int carpim(int a, int b){
        return (a * b);
    }

    public static int carpim(int a, int b, int c){
        return (a * b * c);
    }




    public static void main(String[] args) {
        /*
        Method Overloading kullanarak bir tane hesap makinesi tasarlamaya çalışın.
        Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.
         */

        Scanner scanner = new Scanner(System.in);

        String islemler = "1.Toplama İşlemi\n"
                + "2.Çıkarma İşlemi\n"
                + "3.Çarpma İşlemi\n"
                + "4.Bölme İşlemi\n"
                + "Çıkış için q'ya basın.";

        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");

        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {

                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2 ){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamları: " + toplama(a,b));
                }

                else if (kacsayi == 3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamları: " + toplama(a,b,c));

                }

                else {
                    System.out.println("Bunun için uygun metot bulunmuyor...");
                }


            }

            else if (islem.equals("2")){
                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların farkı: " + cikarma(a,b));
            }

            else if (islem.equals("3")){

                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");

                int kacsayi = scanner.nextInt();


                if (kacsayi == 2) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların çarpımları: " + carpim(a,b));
                }

                else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların çarpımları: " + carpim(a,b,c));
                }

                else {
                    System.out.println("Bunun için uygun metot bulunmuyor...");
                }

            }

            else if (islem.equals("4")){
                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların bölümü: " + bolme(a,b) );
            }

            else {
                System.out.println("Geçersiz işlem...");
            }
        }




    }
}
