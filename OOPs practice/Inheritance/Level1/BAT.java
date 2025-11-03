class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Savings Account, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Checking Account, Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int durationInMonths;

    public FixedDepositAccount(int accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Fixed Deposit Account, Duration: " + durationInMonths + " months");
    }
}

public class BAT {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 50000, 5.5);
        CheckingAccount ca = new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 100000, 12);

        sa.displayAccountType();
        System.out.println("------------------");
        ca.displayAccountType();
        System.out.println("------------------");
        fda.displayAccountType();
    }
}
