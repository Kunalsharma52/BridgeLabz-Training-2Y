import java.util.function.Predicate;

public class TAS{
    public static void main(String[] args) {
        double threshold = 40.0;
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 42.5;

        if (isHighTemp.test(currentTemp))
            System.out.println("Alert! Temperature crossed the threshold.");
        else
            System.out.println("Temperature is normal.");
    }
}
