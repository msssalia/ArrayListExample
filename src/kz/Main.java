package kz;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static BankApplication bankApplication = new BankApplication();
    public static ArrayList<Account> accounts = new ArrayList<>();
    public static void main(String[] args) {

        Account account = new Account();
        account.setId(1);
        account.setName("bank account");
        account.setSurname("Berdibaev");
        account.setBalance(36660);
        accounts.add(account);


//        System.out.println(Arrays.toString());
    }

}