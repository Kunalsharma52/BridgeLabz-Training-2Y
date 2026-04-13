public class MysterySortComparison {

    static double mystery(int n) {
        return 5 * n * n + 100 * n + 1000;
    }

    static double merge(int n) {
        return 10 * n * (Math.log(n) / Math.log(2));
    }

    public static void main(String[] args) {

        for (int n = 1; n <= 1000; n *= 10) {
            System.out.println("n = " + n);
            System.out.println("Mystery: " + mystery(n));
            System.out.println("Merge: " + merge(n));
            System.out.println();
        }
    }
}