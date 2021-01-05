package Bolum08_OOP_Part1_Siniflar_Metodlar_Constructorlar_ve_Inheritance._03_Constructor1;

public class Test {

    public static void main(String[] args) {

        //Account account1 = new Account();

        /*
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Mustafa Murat Coşkun");
        account1.setEmail("coskun.m.murat@gmail.com");
        account1.setTelefonNo("232323232");

        System.out.println("Bakiye " + account1.getBakiye());

         */

        Account account2 = new Account("123456",1000.0,"Mustafa Murat Coşkun","coskun.m.murat@gmail.com","324567");

        account2.paraYatir(500);  // Yeterli bakiye yok... Bakiye = 1000.0

        account2.paraCekme(2000); // Yeterli bakiye yok... Bakiye = 1000.0





    }
}
