package Bolum12_Genericler._01_Generic_Sinif_Olusturma;

public class YazdirmaSinifi<E> {

    public void yazdir(E[] dizi){

        for (E e: dizi){

            System.out.println(e);
        }


    }
}
