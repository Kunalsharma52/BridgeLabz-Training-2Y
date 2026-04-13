public class LinearSearchWord {

    static String search(String[] arr, String word) {
        for (String s : arr) {
            if (s.contains(word))
                return s;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] arr = {"Java is fun", "DSA is important"};

        System.out.println(search(arr, "DSA"));
    }
}