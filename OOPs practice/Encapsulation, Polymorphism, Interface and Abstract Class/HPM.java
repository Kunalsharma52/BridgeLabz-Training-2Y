import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
        System.out.println("Record added for " + name);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + name + ": Confidential Access");
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(int id, String name, int age, int daysAdmitted, double roomChargePerDay) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

public class HPM {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Kunal Sharma", 28, 4, 2500);
        OutPatient p2 = new OutPatient(102, "Neha Patel", 34, 800);

        p1.addRecord("Admitted for surgery");
        p2.addRecord("Routine checkup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            p.viewRecords();
            System.out.println("----------------------");
        }
    }
}
