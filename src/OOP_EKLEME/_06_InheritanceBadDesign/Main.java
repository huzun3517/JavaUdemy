package OOP_EKLEME._06_InheritanceBadDesign;

public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,"Su",2),1);

    }
}
