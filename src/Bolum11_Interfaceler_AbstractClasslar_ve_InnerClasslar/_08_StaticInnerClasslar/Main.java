package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._08_StaticInnerClasslar;

public class Main {

    public static void main(String[] args) {

        Matematik.Alan alan = new Matematik.Alan(); //todo -->farkı static olmasaydı new Matematik().new Alan(); yapacaktık.

        alan.daire_alan(5); // todo daire_alan() methodumuz static değilken obje oluşturup çağırabildik.

        Matematik.Alan.daire_alan(6); // todo --> methodumuzu static yapınca Obje oluşturmadan da
                                            //  todo Class ile methodu çağırabiliriz.
    }
}
