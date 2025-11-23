public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj.doubleValue(); // to primitive double
        int i = dObj.intValue();       // to primitive int (casting)

        System.out.println("Double primitive: " + d);
        System.out.println("Integer primitive: " + i);
    }
}
