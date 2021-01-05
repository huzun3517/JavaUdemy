package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._06_InheritanceBadDesign;

public class MySqlProductDao {

    private String connectionString;

    public MySqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(Product product) {
        System.out.println("MySql Database " + product.getName() + " eklendi." );
    }
}




