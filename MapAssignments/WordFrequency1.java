import java.util.*;

public class WordFrequency1 {
    public static void main(String[] args) {
        String sentence = "apple mango apple orange mango apple";
        String[] words = sentence.split(" ");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            if (freq.containsKey(w))
                freq.put(w, freq.get(w) + 1);
            else
                freq.put(w, 1);
        }

        System.out.println("Word Frequency:");
        for (String w : freq.keySet())
            System.out.println(w + " = " + freq.get(w));
    }
}
