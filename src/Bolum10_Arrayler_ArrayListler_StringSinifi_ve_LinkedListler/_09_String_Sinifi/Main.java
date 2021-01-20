package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._09_String_Sinifi;

public class Main {

    public static void main(String[] args) {

    /*  String a = "Mustafa";

        String b = new String("Mustafa");

        System.out.println(b);

     */

   /*   System.out.println("Harf sayısı: " + b.length()); // 7

        System.out.println("0. indeks : " + b.charAt(0)); // M
        System.out.println("0. indeks : " + b.charAt(2)); // s
        System.out.println("0. indeks : " + b.charAt(b.length()-1)); // son indexi verir.  --> a

    */

    /*  for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }

     */

    /*  System.out.println(b.startsWith("Mu")); // True
        System.out.println(b.startsWith("As")); // False

        System.out.println(b.endsWith("CO")); // False
        System.out.println(b.endsWith("fa")); // True

     */

    /*  System.out.println(b.indexOf('a')); // 4
        System.out.println(b.indexOf('b')); // -1
        System.out.println(b.lastIndexOf('a')); // son a nın yerinin verir. --> 6

     */

   /*   System.out.println(b.toLowerCase()); // mustafa
        System.out.println(b.toUpperCase()); // MUSTAFA

    */

    /*    String str = "1923";
        int i = Integer.parseInt(str); // String i Integer a çevirdik.

        System.out.println(i);

     */

    /*    int i2 = 1923;
        String str2 = String.valueOf(i2); // Integer ı String e çevirdik.
        System.out.println(str2);

     */

    /*  String a1 = "Mustafa";
        String a2 = "Mustafa";
        if (a1 == a2) {
            System.out.println("Eşitler");
        }

     */

        String b1 = new String("Musatafa");
        String b2 = new String("Musatafa");

  /*    if (b1 == b2) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit değiller"); //b1 b2 ye eşit değil. Farklı yerleri gösterir.
        }

   */

        if (b1.equals(b2)) {
            System.out.println("Eşitler");  // b1 ile b2 nin içeriği aynıdır. Güvenli.
        }
    }
}