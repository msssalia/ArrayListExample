package kz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static BankApplication bankApplication = new BankApplication();
    public static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        accounts = bankApplication.allAccounts();
        System.out.println("До удаления = ");
        accounts.forEach(System.out::println);

        bankApplication.removeAccount( 2);

        System.out.println("После удаления = ");
        accounts.forEach(System.out::println);

    }

}