package oop1;

public class CorporateCustomer extends Customer{
    private String companyName; // Kurumsal müşterinin şirket adı
    private String taxNumber;   // Kurumsal müşterinin vergi numarası
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getTaxNumber() {
        return taxNumber;
    }
    
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
