public class StringBufferConcatenation {
    public static void main(String[] args) {

        String[] arr = {"Java", "DSA", "Lab"};

        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s).append(" ");
        }

        System.out.println(sb.toString());
    }
}