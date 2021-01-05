package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_InterfaceRealLife;

public class ComplexUserCheckService implements IUserCheckService {

    public boolean checkUser(User user) {

        if (user.getAge() >= 18 && user.getName().startsWith("Mu")) {
            return true;
        }
        return false;
    }
}
