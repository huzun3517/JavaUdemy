package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._04_Constructor2;

public class Text { public static void main(String[] args) {

    Account account1 = new Account();

    //System.out.println(account1.getEmail());

    Account account2 = new Account("Ahmet Can","example@gmail.com","4545454545454");

    /*
    System.out.println(account2.getEmail());

    System.out.println(account2.getBakiye());

     */

    account2.bilgilerigoster();




}
}
