public class NestedTryCatch {
    public static void methodB() {
        try { Integer.parseInt("abc"); }
        catch(NumberFormatException e) { System.out.println("Caught NumberFormatException in B"); }
    }

    public static void methodA() {
        try {
            methodB();
            String s = null;
            s.length();
        } catch(Exception e) { System.out.println("Exception propagated to A: " + e); }
    }

    public static void main(String[] args) { methodA(); }
}
