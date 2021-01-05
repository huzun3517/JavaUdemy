package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._10_Proje_Calisanlar_Programi;

public class Yonetici extends Calisan {

    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı: " + sorumlu_kisi_sayisi);
    }

    public void zamYap(int zamMiktari) {

        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    }
}
