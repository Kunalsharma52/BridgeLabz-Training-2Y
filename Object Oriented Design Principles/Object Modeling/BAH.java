import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nCustomer: " + name);
        for (Account a : accounts) {
            System.out.println("Account No: " + a.getAccountNumber() + ", Balance: " + a.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void showCustomers() {
        System.out.println("\nBank Name: " + bankName);
        System.out.println("Customers Associated:");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

public class  BAH {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Account a1 = new Account("A1001", 5000.0);
        Account a2 = new Account("A1002", 8500.5);
        Account a3 = new Account("A1003", 12000.0);

        bank.openAccount(c1, a1);
        bank.openAccount(c1, a2);
        bank.openAccount(c2, a3);

        bank.showCustomers();
        c1.viewBalance();
        c2.viewBalance();
    }
}
