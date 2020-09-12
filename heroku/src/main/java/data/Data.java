package data;

import objects.Account;

public class Data {
    public static Account validAccount() {
        Account account = new Account();
        account.setUsername("tomsmith");
        account.setPassword("SuperSecretPassword!");
        return account;
    }

    public static Account invalidAccountUsername() {
        Account account = new Account();
        account.setUsername("khanhdo");
        account.setPassword("SuperSecretPassword!");
        return account;
    }

    public static Account invalidAccountPassword() {
        Account account = new Account();
        account.setUsername("tomsmith");
        account.setPassword("SuperSecretPassword");
        return account;
    }
}
