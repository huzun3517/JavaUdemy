package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_Interface_RealLife_Gercek_Hayat_Projelerinde_Soyutlama;

public class ComplexUserCheckService implements IUserCheckService {

    public boolean checkUser(User user) {

        if (user.getAge() >= 18 && user.getName().startsWith("Mu")) {
            return true;
        }
        return false;
    }
}
