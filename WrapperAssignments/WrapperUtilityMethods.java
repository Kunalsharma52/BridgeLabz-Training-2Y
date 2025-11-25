public class WrapperUtilityMethods {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        double d = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer.parseInt: " + i);
        System.out.println("Double.parseDouble: " + d);
        System.out.println("Boolean.parseBoolean: " + b);
        System.out.println("Integer.toBinaryString(10): " + binary);
        System.out.println("Character.isDigit('5'): " + isDigit);
        System.out.println("Character.toUpperCase('a'): " + upper);
    }
}
