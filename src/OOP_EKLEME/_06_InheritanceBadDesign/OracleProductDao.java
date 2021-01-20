package OOP_EKLEME._06_InheritanceBadDesign;

public class OracleProductDao {

    private String connectionString;

    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(Product product) {
        System.out.println("Oracle Database " + product.getName() + " eklendi." );
    }
}
