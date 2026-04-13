public class SearchIn2DMatrix {

    static boolean search(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0, right = r * c - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int value = matrix[mid / c][mid % c];

            if (value == target)
                return true;
            else if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,3,5},{7,9,11}};

        System.out.println(search(mat, 9));
    }
}