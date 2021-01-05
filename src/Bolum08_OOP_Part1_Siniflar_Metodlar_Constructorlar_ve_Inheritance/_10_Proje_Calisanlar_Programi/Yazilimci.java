package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._10_Proje_Calisanlar_Programi;

public class Yazilimci extends Calisan {

    private String diller;


    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }

    public void formatAt(String isletim_sistemi) {

        System.out.println(getAd() + " " + isletim_sistemi + " ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının Bildiği Diller: " + diller);
    }
}
