interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TransactionData {
    double amount;

    TransactionData(double amount) {
        this.amount = amount;
    }
}

class BackupProcessor {
    public void backup(Object obj) {
        if (obj instanceof BackupSerializable)
            System.out.println("Backing up data: " + obj.getClass().getSimpleName());
        else
            System.out.println("Cannot backup " + obj.getClass().getSimpleName() + " (not serializable).");
    }
}

public class DSB {
    public static void main(String[] args) {
        UserData user = new UserData("Kunal", 22);
        TransactionData txn = new TransactionData(2500.50);

        BackupProcessor processor = new BackupProcessor();
        processor.backup(user);
        processor.backup(txn);
    }
}
