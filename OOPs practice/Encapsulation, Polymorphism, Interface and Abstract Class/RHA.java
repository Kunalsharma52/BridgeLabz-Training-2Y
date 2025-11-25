import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
        System.out.println("Updated location for " + driverName + " to " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    public Car(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }
}

class Bike extends Vehicle {
    public Bike(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }
}

class Auto extends Vehicle {
    public Auto(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 30;
    }
}

public class RHA{
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Car car = new Car("C001", "Amit Kumar", 15.5, "Connaught Place");
        Bike bike = new Bike("B001", "Ravi Singh", 8.0, "Karol Bagh");
        Auto auto = new Auto("A001", "Suresh Yadav", 10.0, "Lajpat Nagar");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("Fare for 10 km: ₹" + v.calculateFare(10));
            v.updateLocation("Rajiv Chowk");
            System.out.println("--------------------------");
        }
    }
}
