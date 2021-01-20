package OOP_EKLEME._07_InheritanceGoodDesign;

public class OracleProductDao extends BaseProductDao {
    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oracle Database : " + product.getName() + " eklendi");
    }
}
