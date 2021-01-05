package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_InterfaceRealLife;

public class Main {


    public static void main(String[] args) {

        SingUpManager singUpManager = new SingUpManager(new AgeUserCheckService());
        singUpManager.signUp(new User(1,"Murat",26));

        SingUpManager singUpManager2 = new SingUpManager(new ComplexUserCheckService());
        singUpManager2.signUp(new User(2,"Serhat",28));



    }
}
