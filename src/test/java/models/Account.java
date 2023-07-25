package models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder

public class Account {
    String accountName;
    String webSite;
    String type;
    String industry;
    String phone;
    String fax;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingZip_PostalCode;
    String billingState_Province;
    String billingCountry;
    String shippingCity;
    String shippingZip_PostalCode;
    String shippingState_Province;
    String shippingCountry;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingAddress;
    String shippingAddress;

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingZip_PostalCode() {
        return billingZip_PostalCode;
    }

    public void setBillingZip_PostalCode(String billingZip_PostalCode) {
        this.billingZip_PostalCode = billingZip_PostalCode;
    }

    public String getBillingState_Province() {
        return billingState_Province;
    }

    public void setBillingState_Province(String billingState_Province) {
        this.billingState_Province = billingState_Province;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingZip_PostalCode() {
        return shippingZip_PostalCode;
    }

    public void setShippingZip_PostalCode(String shippingZip_PostalCode) {
        this.shippingZip_PostalCode = shippingZip_PostalCode;
    }

    public String getShippingState_Province() {
        return shippingState_Province;
    }

    public void setShippingState_Province(String shippingState_Province) {
        this.shippingState_Province = shippingState_Province;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public Account(String accountName, String webSite, String type, String industry, String phone, String fax, String employees, String annualRevenue, String billingCity, String billingZip_PostalCode, String billingState_Province, String billingCountry, String shippingCity, String shippingZip_PostalCode, String shippingState_Province, String shippingCountry, String description, String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.industry = industry;
        this.phone = phone;
        this.fax = fax;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.billingCity = billingCity;
        this.billingZip_PostalCode = billingZip_PostalCode;
        this.billingState_Province = billingState_Province;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingZip_PostalCode = shippingZip_PostalCode;
        this.shippingState_Province = shippingState_Province;
        this.shippingCountry = shippingCountry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }
}