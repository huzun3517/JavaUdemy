package OOP_EKLEME._07_InheritanceGoodDesign;

public class Main {

    public static void main(String[] args) {

       ProductManager productManager = new ProductManager(new MySqlProductDao("MySql String"));
       productManager.add(new Product(2,"çikolota",5));
    }
}

// SPring  IOC Container
