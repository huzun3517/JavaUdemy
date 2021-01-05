package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._04_AbstractClasslar;

public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {

        this.isim = isim;
    }

    public void ismini_soyle(){

        System.out.println("Bu obje " + isim + " objesidir.");
    }


    abstract void alan_hesapla();


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

