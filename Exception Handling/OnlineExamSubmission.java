import java.time.LocalDateTime;

class LateSubmissionException extends Exception { public LateSubmissionException(String m){ super(m); } }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String m){ super(m); } }

public class OnlineExamSubmission {
    static LocalDateTime deadline = LocalDateTime.of(2025,11,25,23,59);

    public static void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if(!fileName.endsWith(".pdf")) throw new InvalidFileFormatException("Invalid file format");
        if(submissionTime.isAfter(deadline)) throw new LateSubmissionException("Submission late");
        System.out.println("Exam submitted successfully");
    }

    public static void main(String[] args) {
        try { submitExam("test.doc", LocalDateTime.now()); }
        catch(Exception e) { System.out.println("Submission failed: " + e.getMessage()); }
    }
}

