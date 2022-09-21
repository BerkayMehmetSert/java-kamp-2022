package oop1;

public class IndividualCustomer extends Customer {
    // Customer'dan extend edildiğinden dolayı Customer'ın tüm özelliklerini miras aldı.
    private String firstName;   // Bireysel müşterinin adı
    private String lastName;    // Bireysel müşterinin soyadı
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
