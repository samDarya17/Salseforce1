package models;



public class AccountFactory {
    static Faker faker = new Faker();
    public static Account get(){
        return Account.builder()
                .accountName(faker.funnyName().name())
                .fax(faker.phoneNumber().subscriberNumber(7))
                .billingAddress(faker.address().streetAddress())
                .build();
    }
}