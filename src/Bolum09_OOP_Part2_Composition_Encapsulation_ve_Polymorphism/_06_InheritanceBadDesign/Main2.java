package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._06_InheritanceBadDesign;

public class Main2 {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,"Su",2),2);

    }
}


