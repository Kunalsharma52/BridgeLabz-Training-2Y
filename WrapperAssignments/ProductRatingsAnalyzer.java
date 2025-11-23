import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {5, 4, 3};
        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(5);
        objectRatings.add(null);
        objectRatings.add(4);

        List<Integer> allRatings = new ArrayList<>();
        for(int r : primitiveRatings) allRatings.add(r); // auto-boxing
        for(Integer r : objectRatings) if(Objects.nonNull(r)) allRatings.add(r);

        double sum = 0;
        for(int r : allRatings) sum += r;
        double avg = sum / allRatings.size();

        System.out.println("Average rating: " + avg);
    }
}
