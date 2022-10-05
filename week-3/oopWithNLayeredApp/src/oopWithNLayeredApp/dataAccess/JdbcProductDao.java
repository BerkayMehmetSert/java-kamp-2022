package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    // Dao      : Data Access Object
    // public   : Başka bir paketten de erişilebilir.
    // İş kuralları yazılacak. (Business rules)
    public void add(Product product) {
        // Sadece database erişim kodları buraya yazılacak.
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
