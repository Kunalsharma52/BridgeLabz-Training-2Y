import java.util.ArrayList;

class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("\nPatient: " + name);
        System.out.println("Consulted Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("\nDoctor: " + name + " (" + specialization + ")");
        System.out.println("Patients Consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospital() {
        System.out.println("\nHospital Name: " + hospitalName);
        System.out.println("Doctors Available:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("\nRegistered Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class HDP {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Alice", "Cardiologist");
        Doctor d2 = new Doctor("Bob", "Dermatologist");
        Doctor d3 = new Doctor("Charlie", "Neurologist");

        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Emma");
        Patient p3 = new Patient("Liam");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addDoctor(d3);

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        d3.consult(p3);
        d3.consult(p2);

        hospital.showHospital();

        d1.showPatients();
        d2.showPatients();
        d3.showPatients();

        p1.showDoctors();
        p2.showDoctors();
        p3.showDoctors();
    }
}
