package data;

import objects.Account;

public class Data {
    public static Account standardUser() {
        Account account = new Account();
        account.setUsername("standard_user");
        account.setPassword("secret_sauce");
        return account;
    }

    public static Account lockedoutdUser() {
        Account account = new Account();
        account.setUsername("locked_out_user");
        account.setPassword("secret_sauce");
        return account;
    }

    public static Account problemdUser() {
        Account account = new Account();
        account.setUsername("problem_user");
        account.setPassword("secret_sauce");
        return account;
    }

    public static Account performanceUser() {
        Account account = new Account();
        account.setUsername("performance_glitch_user");
        account.setPassword("secret_sauce");
        return account;
    }
}
