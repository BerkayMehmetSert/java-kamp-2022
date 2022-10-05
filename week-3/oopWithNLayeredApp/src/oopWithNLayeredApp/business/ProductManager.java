package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    // İş kuralları yazılacak. (Business rules)
    // throw : Hata fırlatma.
    // Bir interface onu implemente eden class'ın referansını tutabilir.
    // Bir katman baika bir katmanın class'ını sadece interface'ini kullanmalıdır.
    // this : class'ın kendisini temsil eder. (Bu class)
    private ProductDao productDao;
    private Logger[] loggers;
    
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    
    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }
        
        productDao.add(product);
        
        // [DatabaseLogger, FileLogger]
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
