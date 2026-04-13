import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            count += words.length;
        }

        System.out.println("Word Count: " + count);
        br.close();
    }
}