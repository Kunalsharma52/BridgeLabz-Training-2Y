import java.util.*;

class NumberSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for(Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> li = List.of(10, 20, 30);
        List<Double> ld = List.of(1.5, 2.5);

        System.out.println(sumNumbers(li));
        System.out.println(sumNumbers(ld));
    }
}
