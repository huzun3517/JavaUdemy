package Bolum15_Exception_Handling_IstisnaYakalama;

public class _05_ExceptionPropagation {

    public static void main(String[] args) {

        //TODO
        // a- 3 tane method yazıyorum.
        // b- 1.Metod--2.Metodu, 2.Metod--> 3.Metodu çağırsın.
        // c- 3.Metod ArithmeticException hatası fırlatsın.
        // d- Main de 1.Metodunuzu çağırın. Hatayı yakalayın.

        birincifonksiyon();

    }

    public static void ucuncufonksiyon(){
        try {
            int a = 12 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }
    }


    public static void ikincifonksiyon(){
        ucuncufonksiyon();
    }

    public static void birincifonksiyon() {
        ikincifonksiyon();
    }
}

    //TODO
    // üçüncü metodda oluşturduğum hatayı ister üçüncü metodda, ister ikinci metodda,
    // ister birinci metodda yakalayabilirim.
    // Hiçbir metod da yakalamadıysak da main de mutlaka yakalamalıyız. Yoksa hata verecek...
    // Bu örnekte 3.Metodda oluşturduğum hatayı 3.Metotda yakaladım.
    // Sizde diğer methodlarda ya da Main de yakalayabilirsiniz. Ama kaçırmayın :)
