public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

        long start, end;

        StringBuilder sb1 = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++)
            sb1.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start));

        StringBuffer sb2 = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++)
            sb2.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start));
    }
}