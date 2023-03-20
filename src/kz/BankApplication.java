package kz;

import java.util.*;
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

    public List<Account> allAccounts() {
        accounts = new ArrayList<Account>();

//        List<Account> accountList = new ArrayList<>();

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.setId(1);
        account1.setName("Nursultan");
        account1.setSurname("Berdibaev");
        account1.setBalance(36660);

        accounts.add(account1);

        account2.setId(2);
        account2.setName("Alisher");
        account2.setSurname("Masimov");
        account2.setBalance(18000);

        accounts.add(account2);

        account3.setId(3);
        account3.setName("Adina");
        account3.setSurname("Sanayatova");
        account3.setBalance(40000);
        accounts.add(account3);

        return accounts;

    }


    public void removeAccount(int id) {
        Account account = new Account();

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
