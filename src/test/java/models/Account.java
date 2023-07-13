package models;

public class Account {
    String accountName;
    String webSite;

    String fax;
    String phone;
    String type;

   public Account(String accountName,String phone, String fax, String webSite) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.type = type;
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
    public String getType() {
        return type;
    }
    public void setType(String type){
   this.type = type;
   }
}
