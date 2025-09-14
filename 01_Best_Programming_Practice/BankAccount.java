class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public void displayDetails() {
        if(this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Account No: " + accountNumber + ", Holder: " + accountHolderName);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("ACC101", "Alice");
        BankAccount b2 = new BankAccount("ACC102", "Bob");
        b1.displayDetails();
        b2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
