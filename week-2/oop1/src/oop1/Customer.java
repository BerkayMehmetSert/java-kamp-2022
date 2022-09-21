package oop1;

public class Customer {
    private int id;                 // Benzersiz kimlik numarası
    private String customerNumber;  // Müşteri numarası
    private String phone;           // Müşteri telefon numarası
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCustomerNumber() {
        return customerNumber;
    }
    
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
