import java.io.*;

class FileHandler {
    public FileHandler(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.close();
    }
}

public class ConstructorExceptionPropagation {
    public static void main(String[] args) {
        try { FileHandler fh = new FileHandler("missingfile.txt"); }
        catch(IOException e) { System.out.println("File error: " + e.getMessage()); }
    }
}
