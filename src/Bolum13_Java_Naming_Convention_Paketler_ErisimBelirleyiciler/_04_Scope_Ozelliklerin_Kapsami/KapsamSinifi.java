package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._04_Scope_Ozelliklerin_Kapsami;

public class KapsamSinifi {

    private int privateDegisken = 30;

    public KapsamSinifi() {
        System.out.println("privateDegisken = " + privateDegisken);
    }

    public void onIleCarp(){
        int privateDegisken = 10;

        for (int i = 1; i < 6; i++) {

            System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
            // this kullandığımız için Class da tanımlı değişkeni kullanır.
            // Eğer this kullanmasaydık method içindeki lokal değişkeni kullanacaktı.
        }
    }
}
