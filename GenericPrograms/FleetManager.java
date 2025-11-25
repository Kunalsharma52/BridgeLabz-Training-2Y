import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T v) { fleet.add(v); }
    public void showFleet() {
        fleet.forEach(v -> System.out.println(v.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        FleetManager<Truck> fm1 = new FleetManager<>();
        fm1.addVehicle(new Truck());
        fm1.showFleet();

        FleetManager<Bike> fm2 = new FleetManager<>();
        fm2.addVehicle(new Bike());
        fm2.showFleet();
    }
}
