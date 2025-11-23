import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String m){ super(m); } }
class NetworkFailureException extends Exception { public NetworkFailureException(String m){ super(m); } }

class Transaction {
    public void process() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int r = new Random().nextInt(3);
        switch(r){
            case 0: throw new NegativeAmountException("Negative amount not allowed");
            case 1: throw new InsufficientFundsException("Insufficient balance");
            case 2: throw new NetworkFailureException("Network error, try later");
        }
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process();
            System.out.println("Transaction successful!");
        } catch(NegativeAmountException e) { System.out.println(e.getMessage()); }
        catch(InsufficientFundsException e) { System.out.println(e.getMessage()); }
        catch(NetworkFailureException e) { System.out.println(e.getMessage()); }
    }
}
