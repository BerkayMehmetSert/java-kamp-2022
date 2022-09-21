package oop1;

// Class naming convention      : PascalCase
// Method naming convention     : camelCase
// Variable naming convention   : camelCase
// Field naming convention      : camelCase
public class Product {
    // Genel Ürünleri tanımlayabilecek ortamı hazırlıyoruz. Birnevi bir şablon gibi düşünebiliriz.
    // private => sadece bu class içerisinde erişilebilir.
    
    private String name;        // Ürünün adı
    private double unitPrice;   // Ürünün birim fiyatı
    private double discount;    // Ürünün indirim oranı
    private String imageUrl;    // Ürünün resim url'i
    private int unitsInStock;   // Ürünün stok adedi
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public int getUnitsInStock() {
        return unitsInStock;
    }
    
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    
}
