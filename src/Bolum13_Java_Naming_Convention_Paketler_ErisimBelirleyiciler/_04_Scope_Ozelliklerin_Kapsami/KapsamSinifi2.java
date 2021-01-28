package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._04_Scope_Ozelliklerin_Kapsami;

public class KapsamSinifi2 {

    private int privateDegisken = 30;

    public KapsamSinifi2() {

    }



    public class DahiliSinif{

        private int privateDegisken = 20;
        private int a= 3;

        public void onIleCarp(){

   //       int privateDegisken = 10; // En lokal olanı kullanır. Yani bu satırdaki değişkeni.

            for (int i = 1; i < 6; i++) {

  //            System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
                // this desem de Dahili Sınıfının değişkenini kullanır.

                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken));
                // KapsamSinifi2.this dersem eğer ozaman en dışta bulunan KapsamSinifi2 Class ının değişkenini kullanabiliriz.



            }
        }
    }

    public void dahiliSinifKontrol(){
        DahiliSinif d = new DahiliSinif();

        System.out.println("Kontrol ediliyor... " + d.a);
    }
}
