package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_InterfaceRealLife;

public class AgeUserCheckService implements IUserCheckService {

    // Method

    public boolean checkUser(User user) {

        if (user.getAge() >= 18) {
            return true;
        }
        return false;
    }
}
