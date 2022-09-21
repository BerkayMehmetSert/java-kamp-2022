package oop1;

public class Main {
    public static void main(String[] args) {
        // Nesne tanımlama:
        // veri_tipi nesne_adi = new veri_tipi();
        // set value = Değer atama
        // get value = Değer alma, okuma

//        Product product1 = new Product();
//        product1.name = "Delonghi Kahve Makinesi"; // set value
//        product1.unitPrice = 7500;
//        product1.discount = 7;
//        product1.unitsInStock = 10;
//        product1.imageUrl = "img.jpg";
        
        // System.out.println(product1.name); // get value
        
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(10);
        product1.setImageUrl("img.jpg");
        
        Product product2 = new Product();
        product2.setName("Sweg Kahve Makinesi");
        product2.setUnitPrice(8500);
        product2.setDiscount(8);
        product2.setUnitsInStock(10);
        product2.setImageUrl("img-2.jpg");
        
        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(10);
        product3.setImageUrl("img-3.jpg");
        
        // Product türünde products adında bir dizi tanımladık.
        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
            System.out.println(product.getDiscount());
            System.out.println(product.getUnitsInStock());
            System.out.println(product.getImageUrl());
            System.out.println("===================================");
        }
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("555-555-5555");
        individualCustomer.setFirstName("John");
        individualCustomer.setLastName("Doe");
        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setPhone("555-555-5555");
        corporateCustomer.setCompanyName("ABC Company");
        corporateCustomer.setTaxNumber("1234567890");
        
        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
