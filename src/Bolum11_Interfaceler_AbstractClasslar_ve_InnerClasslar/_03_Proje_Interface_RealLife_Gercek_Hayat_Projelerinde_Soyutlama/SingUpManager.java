package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._03_Proje_Interface_RealLife_Gercek_Hayat_Projelerinde_Soyutlama;

public class SingUpManager {

    private IUserCheckService iUserCheckService;

    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user) {

        if (iUserCheckService.checkUser(user)) {

            System.out.println("Kullanıcı kayıt oldu: " + user.getName());
        }

        else {
            System.out.println("Kullanıcı Kayıt Olamadı.");
        }




    }
}
