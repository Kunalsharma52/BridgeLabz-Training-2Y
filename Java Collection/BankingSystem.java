import java.util.*;

class Account { String id; double balance; Account(String id,double b){this.id=id;this.balance=b;} public String toString(){return id+":"+balance;} }
class Transaction { String id; String accId; double amt; Transaction(String id,String a,double amt){this.id=id;this.accId=a;this.amt=amt;} public String toString(){return id+":"+accId+":"+amt;} }

public class BankingSystem {
    List<Transaction> all = new ArrayList<>();
    Queue<Transaction> pending = new LinkedList<>();
    Set<String> validAccounts = new HashSet<>();
    Stack<Transaction> rollback = new Stack<>();
    Map<String,Account> accounts = new HashMap<>();

    public void addAccount(Account a){ accounts.put(a.id,a); validAccounts.add(a.id); }
    public void addTransaction(Transaction t){ all.add(t); pending.add(t); }
    public void processNext(){
        Transaction t = pending.poll();
        if(t==null) return;
        if(!validAccounts.contains(t.accId)){ System.out.println("Invalid: "+t); return; }
        Account a = accounts.get(t.accId);
        // apply
        a.balance += t.amt;
        rollback.push(t);
        System.out.println("Executed "+t+" newBal="+a.balance);
    }
    public void rollbackLast(){
        if(rollback.isEmpty()) return;
        Transaction t = rollback.pop();
        Account a = accounts.get(t.accId);
        a.balance -= t.amt;
        System.out.println("Rolled back "+t+" bal="+a.balance);
    }
    public static void main(String[] args){
        BankingSystem b = new BankingSystem();
        b.addAccount(new Account("A1",1000));
        b.addAccount(new Account("A2",500));
        b.addTransaction(new Transaction("T1","A1",-100));
        b.addTransaction(new Transaction("T2","A2",200));
        b.processNext();
        b.processNext();
        b.rollbackLast();
    }
}
