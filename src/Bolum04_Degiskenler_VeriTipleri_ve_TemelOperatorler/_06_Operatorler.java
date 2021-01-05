package Bolum04_Degiskenler_VeriTipleri_ve_TemelOperatorler;

public class _06_Operatorler {

    public static void main(String[] args) {
        /*

        + --> Toplama Operatörü
        - --> Çıkarma Operatörü
        / --> Bölme Operatörü
        * --> Çarpma Operatörü
        % --> Kalan Operatörü



        System.out.println(3 + 4.2);
        System.out.println(3-5f);

        System.out.println(10 / 4);
        System.out.println(10d / 4);
        System.out.println(10 / 4.0);

        System.out.println(3 * 4);
        System.out.println(3 * 4.5);

        System.out.println(10 % 4);



        int a = 4;
        a = a + 2;
        System.out.println(a);



        int b = 6;
        b = b * 3;
        System.out.println(b);



        int a = 4;
        int b = 6;
        a += 2;  // a = a + 2;
        b *= 3; // b = b * 3;

        System.out.println(a);
        System.out.println(b);



        int a = 7;
        int b = 6;
        a++;    // a = a + 1; a += 1;  Postfix gösterim. Artı sağda olursa. a++
        b--;     // b = b - 1; b -= 1;
        System.out.println(a);
        System.out.println(b);



        int a = 7;
        int b = 6;
        ++a;    //   Prefix gösterim. Artı solda olursa. ++a
        --b;
        System.out.println(a);
        System.out.println(b);



        int a = 7;
        System.out.println(a++); // Postfix şeklinde yazarsak güncellenmeyen değer ekrana yazılıyor.

        int b = 7;
        System.out.println(++b); // Prefix şeklinde yazarsak güncellenen değer ekrana yazılıyor.

         */
        // Operatörlerde İşlem Sırası

        System.out.println(3 + 4 * 5);  // Önce çarpma işlemi yapılır.

        System.out.println(3f / 4 + 4 * 5);
        System.out.println((3f / 4) + (4 * 5));  // Parantez kullanarak işlem önceliğini kendiniz belirleyebilirsiniz.

    }
}
