public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will cause NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method that generates NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nCalling method that handles NullPointerException:");
        handleException();
    }
}
