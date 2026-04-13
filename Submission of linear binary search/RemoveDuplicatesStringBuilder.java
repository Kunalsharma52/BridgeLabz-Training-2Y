import java.util.*;

public class RemoveDuplicatesStringBuilder {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }

        System.out.println(result.toString());
    }
}