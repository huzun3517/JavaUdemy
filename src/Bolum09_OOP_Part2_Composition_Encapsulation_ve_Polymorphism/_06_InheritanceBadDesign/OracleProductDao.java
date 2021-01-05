package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._06_InheritanceBadDesign;

public class OracleProductDao {

    private String connectionString;

    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(Product product) {
        System.out.println("Oracle Database " + product.getName() + " eklendi." );
    }
}
