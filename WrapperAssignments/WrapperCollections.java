import java.util.ArrayList;
import java.util.Collections;

public class WrapperCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();

        for(double p : prices) {
            priceList.add(p); // Auto-boxing
        }

        double max = Collections.max(priceList);
        double sum = 0;
        for(double p : priceList) sum += p;
        double avg = sum / priceList.size();

        System.out.println("Highest price: " + max);
        System.out.println("Average price: " + avg);
    }
}
