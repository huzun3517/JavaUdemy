package Bolum10_Arrayler_ArrayListler_StringSinifi_ve_LinkedListler._01_Arrayler;

public class Main {

    public static void arrayi_bastir(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ":" + array[i]);
        }
    }


    public static double ortalamabul(int[] array) {
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam / array.length);
    }


    public static void main(String[] args) {

        //    int a = 5;

        //    a[5] = 32;
        //    a[9] = 50;

        //    double[] b;

        //     int[] a = new int[10];

        /*
        int[] a = {30,40,50,60,70,};
        System.out.println(a[0]); // a nın 0 ıncı index(elemanı) 30 dur.
        System.out.println(a[2]); // a nın 2 inci index i 50 dir.
       // System.out.println(a[6]); // a nın 6 ıncı index i olmadığı için java hata verir.

         */

        /*
        int[] a = new int[5];  // 5 lik bir yer aç demek. Değerlerimi kendim atayacam.

        for (int i = 0; i < 5; i++) {  // Array e değer verme işlemi.

            a[i] = i * 4 + 2;
        }


        for (int i = 0; i < 5; i++) {   // Array i bastırma işlemi.
            System.out.println(a[i]);
        }

         */

        /*
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

         */

        /*
        int[] a = new int[5];

        int[] b = {10,20,30,40,50,60};
        System.out.println("Arrayimizin uzunluğu : " + b.length); // arrayimizin uzunluğu 6 dir.

         */

        int[] a = new int[5];

        int[] b = {10,20,30,40,50,60};

        arrayi_bastir(b);

        System.out.println("Ortalama : " + ortalamabul(b));

    }
}
