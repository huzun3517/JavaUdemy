package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._09_LokalInnerClasslar;

public class Main {

    public static void main(String[] args) {

//    public class Alan { --> LokalInner class lar public olamaz.

        class Alan { // todo Main methodunun içinde LokalInner Class oluşturduk. Mainin içinde geçerli doşında geçerli olmaz.

            public void daire_alan(int yaricap) {

                System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
            }
        }

        Alan alan = new Alan();
        Alan alan2 = new Alan();

        alan.daire_alan(10);
        alan2.daire_alan(3);



    }

    public static void deneme() {

  //      Alan alan3 = new Alan(); --> buna burada erişemiyoruz
    }
}
