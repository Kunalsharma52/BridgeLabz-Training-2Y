import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null"};
        ArrayList<Integer> validMarks = new ArrayList<>();

        for(Object m : marks) {
            if(m instanceof String) {
                try {
                    int val = Integer.parseInt((String)m);
                    validMarks.add(val);
                } catch(Exception e) { }
            } else if(m instanceof Integer) validMarks.add((Integer)m);
        }

        int sum = 0;
        for(int m : validMarks) sum += m;
        double avg = validMarks.size() > 0 ? (double)sum / validMarks.size() : 0;

        System.out.println("Average marks: " + avg);
    }
}
