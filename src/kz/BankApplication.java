package kz;

import java.util.*;

public class BankApplication {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    static List<Integer> ids = new ArrayList<>();
    static List<Double> balances = new ArrayList<>();

    public void addAccount() {
        Account account = new Account();

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

    public List<Double> allBalances() {
        return balances;
    }

    public List<Account> allAccounts() {
        accounts = new ArrayList<Account>();

//        List<Account> accountList = new ArrayList<>();

        Account account1 = new Account();



        account1.setId(135);
        account1.setName("Nursultan");
        account1.setSurname("Berdibaev");
        account1.setBalance(36660d);

        accounts.add(account1);
        Account account2 = new Account();
        account2.setId(157);
        account2.setName("Alisher");
        account2.setSurname("Masimov");
        account2.setBalance(678867);

        accounts.add(account2);

        Account account3 = new Account();
        account3.setId(139);
        account3.setName("Adina");
        account3.setSurname("Sanayatova");
        account3.setBalance(69999);

        accounts.add(account3);

        ids.add(account1.getId());
        ids.add(account2.getId());
        ids.add(account3.getId());

        balances.add(account1.getBalance());
        balances.add(account2.getBalance());
        balances.add(account3.getBalance());

        return accounts;

    }
//
//
//    public void removeAccount(int id) {
//
//
//        for (int i = 0; i < accounts.size(); i++) {
//            if (accounts.get(i).getId() == id) {
//                accounts.remove(i);
//            }
//        }
//
////        for (Account account : accounts) {
////            if (account.getId() == id) {
////                accounts.remove(account.getId()== id);
////            }
////
////            if (account.equals(account.getName().equals("Alisher"))) {
////                System.out.println("Account of Alisher = " + account);
////            }
////        }
//
//
//    }

    public Account getMaxAccount() {
        Account account = new Account();
        double maxNum = -1;

        List<Account> accountList = allAccounts();

        Account maxAccount = accountList
                .stream()
                .max(Comparator.comparing(Account::getBalance))
                .orElseThrow(NoSuchElementException::new);

//        for (int i = 0; i < accountList.size(); i++) {
//            System.out.println(accountList.get(i).getBalance());
//            if (accountList.get(i).getBalance() > maxNum) {
//                System.out.println("maxNum = " + maxNum);
//                maxNum = accountList.get(i).getBalance();
//                System.out.println(accountList.get(i).getBalance());
//                return accountList.get(i);
////                System.out.println("maxNum = " + maxNum);
//            }
//        }
        return maxAccount;
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
