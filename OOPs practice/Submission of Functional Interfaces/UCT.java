interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class UCT {
    public static void main(String[] args) {
        double km = 10.0;
        double kg = 5.0;

        double miles = UnitConverter.kmToMiles(km);
        double lbs = UnitConverter.kgToLbs(kg);

        System.out.println(km + " km = " + miles + " miles");
        System.out.println(kg + " kg = " + lbs + " lbs");
    }
}
