class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayDetails() {
        if(this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber + ", Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Fee: $" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("REG101", "Alice", "Car");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(600.0);
        v1.displayDetails();
    }
}
