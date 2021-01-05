package Bolum09_OOP_Part2_Composition_Encapsulation_ve_Polymorphism._07_InheritanceGoodDesign;

public class MySqlProductDao extends BaseProductDao {

    public MySqlProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Mysql Database : " + product.getName() + " eklendi");
    }
}
