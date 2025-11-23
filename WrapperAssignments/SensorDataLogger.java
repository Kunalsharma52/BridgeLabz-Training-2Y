public class SensorDataLogger {
    public static void logTemperature(Double temp) {
        System.out.println("Logged temp: " + temp);
    }

    public static void main(String[] args) {
        double t1 = 25.5;
        Double t2 = 30.0;

        logTemperature(t1); // auto-boxing
        logTemperature(t2);
    }
}
