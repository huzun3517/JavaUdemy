package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._07_InheritanceGoodDesign;

public class Main {

    public static void main(String[] args) {

       ProductManager productManager = new ProductManager(new MySqlProductDao("MySql String"));
       productManager.add(new Product(2,"çikolota",5));
    }
}

// SPring  IOC Container
