package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._08_StaticInnerClasslar;

public class Matematik {

    private static double PI = Math.PI; // todo burda static yapmazsak aşağıda methodda PI yi direk kullanamayız.

    public static class Alan {



      /*
        public void daire_alan(int yaricap) {  //--> todo önce void method oluşturduk.

            System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
        }

       */

        /*

        public static void daire_alan(int yaricap) { // todo sonra static void yaptık methodu

            System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
        }

         */


        public static void daire_alan(int yaricap) { // todo sonra static void yaptık methodu

            System.out.println("Dairenin Alanı: " + (yaricap * yaricap * PI));
        }


    }
}
