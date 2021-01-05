package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._07_InheritanceGoodDesign;

public class BaseProductDao {

    private String connectionString;

    public BaseProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(Product product) {
        System.out.println("Default Database : " + product.getName());
    }
}
