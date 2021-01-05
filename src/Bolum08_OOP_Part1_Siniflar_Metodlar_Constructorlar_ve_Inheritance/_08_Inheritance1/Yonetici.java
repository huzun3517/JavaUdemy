package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._08_Inheritance1;

public class Yonetici extends Calisan {  // Subclass --> Bir alt sınıf

    private int sorumlu_kisi; // Ekstra özellik


    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
        /*
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;

         */

        super(isim, maas, departman);

        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara " + zam_miktari + " Euro zam yapıldı");
    }

    public void bilgilerigoster() {

        /*System.out.println("İsim : " + getIsim());
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : " + getDepartman());

         */

        super.bilgilerigoster();

        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);



    }


}
