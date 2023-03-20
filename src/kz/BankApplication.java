package kz;

import java.util.*;
import java.util.stream.Stream;

public class BankApplication {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    static List<Integer> ids = new ArrayList<>();

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

    public List<Integer> allIds() {
        return ids;
    }

    public List<Account> allAccounts() {
        accounts = new ArrayList<Account>();

//        List<Account> accountList = new ArrayList<>();

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();


        account1.setId(135);
        account1.setName("Nursultan");
        account1.setSurname("Berdibaev");
        account1.setBalance(36660);

        accounts.add(account1);

        account2.setId(157);
        account2.setName("Alisher");
        account2.setSurname("Masimov");
        account2.setBalance(18000);

        accounts.add(account2);

        account3.setId(139);
        account3.setName("Adina");
        account3.setSurname("Sanayatova");
        account3.setBalance(40000);
        accounts.add(account3);

        ids.add(account1.getId());
        ids.add(account2.getId());
        ids.add(account3.getId());

        return accounts;

    }


    public void removeAccount(int id) {

        for(int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.remove(i);
            }
        }

//        for (Account account : accounts) {
//            if (account.getId() == id) {
//                accounts.remove(account.getId()== id);
//            }
//
//            if (account.equals(account.getName().equals("Alisher"))) {
//                System.out.println("Account of Alisher = " + account);
//            }
//        }


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
