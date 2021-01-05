package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._05_Referanslar;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account("Mustafa Murat Coşkun","coskun.m.murat@gmail.com","3443434");

       /*
        Account account2 = account1;

        if (account1 == account2) {
            System.out.println("Aynı objeyi gösteriyorlar...");
        }

        else {
            System.out.println("Aynı objeyi göstermiyorlar...");
        }

        */

        /*

        Account account3 = new Account();

        if (account1 == account3) {
            System.out.println("Aynı objeyi gösteriyorlar...");
        }

        else {
            System.out.println("Aynı objeyi göstermiyorlar...");
        }

         */

        new Account("ahmet Can","example@gmail.com","654321").bilgilerigoster();


    }
}
