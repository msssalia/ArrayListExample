package kz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static kz.BankApplication.ids;

public class Main {

    static BankApplication bankApplication = new BankApplication();
    public static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        accounts = bankApplication.allAccounts();
         System.out.println("До удаления = ");
        accounts.forEach(System.out::println);
        System.out.println(ids.get(1));

        bankApplication.removeAccount(139);

        System.out.println("После удаления = ");
        accounts.forEach(System.out::println);

    }

}