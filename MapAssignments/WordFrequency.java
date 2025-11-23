import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");

                for (String w : words) {
                    if (w.length() == 0) continue;
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }

            br.close();
        } catch (Exception e) {}

        System.out.println(map);
    }
}
