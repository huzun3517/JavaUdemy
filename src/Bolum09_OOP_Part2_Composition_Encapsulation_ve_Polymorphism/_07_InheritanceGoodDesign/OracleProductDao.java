package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._07_InheritanceGoodDesign;

public class OracleProductDao extends BaseProductDao {
    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oracle Database : " + product.getName() + " eklendi");
    }
}
