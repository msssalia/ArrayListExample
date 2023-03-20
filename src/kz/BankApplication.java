package kz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class BankApplication {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account account) {

        System.out.println("Enter new id: ");
        int id = scanner.nextInt();
        account.setId(id);

        System.out.println("Enter account name: ");
        String name = scanner.next();

        account.setName(name);

        System.out.println("Enter account surname: ");
        String surname = scanner.next();
        account.setSurname(surname);

        System.out.println("Enter account balance: ");
        double balance = scanner.nextDouble();
        account.setBalance(balance);

        System.out.println(account);
        accounts.add(account);
    }


    public void removeAccount(int i) {
//        accounts.remove()
    }

    public Account getMaxAccount() {
//        Stream.of(Account::setBalance).filter(b -> )
//        ArrayList<Integer> balance = new ArrayList<>();

//        Collections.sort(accounts);
        return null;
    }

    public double getAverageBalance() {

        return 0;
    }

    public double getTotalBalance() {
        return 0;
    }

    public int totalAccount() {
        return 0;
    }
   /*
   public String  getBankData() {

    } */
}
