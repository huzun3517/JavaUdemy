package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_Interface_RealLife_Gercek_Hayat_Projelerinde_Soyutlama;

public class Main {


    public static void main(String[] args) {

        SingUpManager singUpManager = new SingUpManager(new AgeUserCheckService());
        singUpManager.signUp(new User(1,"Murat",26));

        SingUpManager singUpManager2 = new SingUpManager(new ComplexUserCheckService());
        singUpManager2.signUp(new User(2,"Serhat",28));



    }
}
