class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    final String patientID;
    String name;
    int age;
    String ailment;

    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayDetails() {
        if(this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("PAT101", "Alice", 30, "Fever");
        Patient p2 = new Patient("PAT102", "Bob", 40, "Cold");
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
