package OOP_EKLEME._06_InheritanceBadDesign;

public class ProductManager {

    public void add(Product product,int databaseType) {
        if (databaseType == 1) {
            // Mysql
            MySqlProductDao mySqlProductDao = new MySqlProductDao("MySql String");
            mySqlProductDao.add(product);
        }
        else if (databaseType == 2) {
            // Oracle
            OracleProductDao oracleProductDao = new OracleProductDao("Oracle String");
            oracleProductDao.add(product);
        }

        System.out.println("Ürün İş katmanı işlemleri");
        System.out.println("Ürün İsmi: " + product.getName());

    }
}
