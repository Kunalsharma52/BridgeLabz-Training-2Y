import java.io.IOException;

class InvalidStudentException extends Exception { public InvalidStudentException(String m){ super(m); } }

public class OnlineExamSystem {
    public static void validateStudent() throws InvalidStudentException { throw new InvalidStudentException("Invalid student"); }
    public static void submitExam() throws IOException, InvalidStudentException { validateStudent(); throw new IOException("IO error"); }

    public static void main(String[] args) {
        try { submitExam(); }
        catch(InvalidStudentException | IOException e) { System.out.println("Error: " + e.getMessage()); }
        finally { System.out.println("Exam submission process completed."); }
    }
}
