package models;

public class Account {
    String accountName;
    String website;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Account(String accountName, String website) {
        this.accountName = accountName;
        this.website = website;
    }
}
