package Bolum13_Java_Naming_Convention_Paketler_ErisimBelirleyiciler._08_Final_Anahtar_Kelimesi2;

// public class Database2 extends Database { // final Class dan extends yapamayız. Alt sınıf oluşturamayız.

public class Database2  {


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    // final methodlar @Override edilemezler.. Methodlarımızın @Override edilmesini istemiyorsak final kullanmalıyız.
}
