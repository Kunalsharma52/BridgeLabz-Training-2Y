import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return "Confidential";
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Holder: " + holderName + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance > 50000;
    }
}

public class BS  {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount sa = new SavingsAccount("SA123", "Kunal", 15000);
        CurrentAccount ca = new CurrentAccount("CA456", "Neha", 60000);
        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);
            acc.deposit(2000);
            acc.withdraw(1000);
            acc.applyForLoan(50000);
            System.out.println("Loan Eligible: " + acc.calculateLoanEligibility());
            System.out.println("----------------------");
        }
    }
}
