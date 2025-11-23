class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){ super(m); } }
class InvalidMileageException extends Exception { public InvalidMileageException(String m){ super(m); } }

class Vehicle {
    int mileage;
    boolean overdue;

    public Vehicle(int mileage, boolean overdue) { this.mileage = mileage; this.overdue = overdue; }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if(mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if(overdue) throw new ServiceOverdueException("Service is overdue!");
        System.out.println("Vehicle maintenance OK");
    }
}

public class VehicleMaintenanceTracker {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(-5, true);
        try { v.checkMaintenance(); }
        catch(ServiceOverdueException | InvalidMileageException e) { System.out.println(e.getMessage()); }
    }
}
