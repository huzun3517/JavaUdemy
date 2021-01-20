package Bolum11_Interfaceler_AbstractClasslar_ve_InnerClasslar._07_Static_Olmayan_Inner_Classlar;

import java.util.Scanner;

public class Matematik {

    private double PI = Math.PI;

    public class Factoriyel { // todo Matematik class ı içinde bir tane Factoriyel adında Inner Class oluşturduk.

        public void faktoriyel() {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            int faktoriyel = 1;

            for (int i = 2; i <= sayi; i++) {

                faktoriyel *= i;
            }
            System.out.println("Faktoriyel: " + faktoriyel);
        }
    }

    public class Asal {

        public boolean asal_mi(int sayi) {

            int i = 2;

            while (i < sayi) {

                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }


    public class Alan { // todo Matematik class ı içinde bir tane Alan adında Inner Class oluşturduk.

        public class DaireAlan{

            public void daire_alan(int yaricap) {

                System.out.println("Dairenin Alanı: " + (yaricap * yaricap * PI));
                // todo buradaki PI değişkenini Matematik class ında tanımlamıştık. Ve Alan adlı Inner Class tan bunu
                //   çağırarak direk kullanabiliyoruz. private olsa bile

            }

        }


        }

    }