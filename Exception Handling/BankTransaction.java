class AccountNotFoundException extends Exception { public AccountNotFoundException(String m){ super(m); } }

class BankTransaction {
    public void verifyAccount() throws AccountNotFoundException { throw new AccountNotFoundException("Account not found"); }
    public void processTransaction() throws InsufficientFundsException { throw new InsufficientFundsException("Insufficient funds"); }
    public void executeTransaction() throws Exception { verifyAccount(); processTransaction(); }

    public static void main(String[] args) {
        BankTransaction bt = new BankTransaction();
        try { bt.executeTransaction(); }
        catch(AccountNotFoundException | InsufficientFundsException e) { System.out.println(e.getMessage()); }
        catch(Exception e) { System.out.println("Other error: " + e.getMessage()); }
        finally { System.out.println("Transaction complete."); }
    }
}
