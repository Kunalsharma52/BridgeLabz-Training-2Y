import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<Integer, String> course = new HashMap<>();

        course.put(101, "Java");
        course.put(102, "Python");
        course.put(103, "DBMS");

        course.put(102, "Advanced Python");

        course.remove(103);

        for (int id : course.keySet())
            System.out.println(id + " = " + course.get(id));
    }
}
