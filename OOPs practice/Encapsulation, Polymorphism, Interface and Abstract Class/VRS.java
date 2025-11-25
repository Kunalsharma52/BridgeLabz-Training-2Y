import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public String getInsurancePolicyNumber() {
        return "Protected Information";
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate per Day: " + rentalRate);
    }
}

class Car extends Vehicle {
    public Car(String number, double rate, String policy) {
        super(number, "Car", rate, policy);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails() {
        return "Car Insurance - 10% of rental rate";
    }
}

class Bike extends Vehicle {
    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance - 5% of rental rate";
    }
}

class Truck extends Vehicle {
    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate, policy);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance - 15% of rental rate";
    }
}

public class VRS {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 2000, "POL001"));
        vehicles.add(new Bike("BIKE456", 500, "POL002"));
        vehicles.add(new Truck("TRUCK789", 3000, "POL003"));

        int days = 5;
        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(days);
            double insurance = v.calculateInsurance();
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance: " + insurance + " (" + v.getInsuranceDetails() + ")");
            System.out.println("Total Cost: " + (rentalCost + insurance));
            System.out.println("----------------------");
        }
    }
}
