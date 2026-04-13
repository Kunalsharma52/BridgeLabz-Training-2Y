public class WordSearchBacktracking {

    static boolean dfs(char[][] grid, String word, int i, int j, int k) {

        if (k == word.length())
            return true;

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
            grid[i][j] != word.charAt(k))
            return false;

        char temp = grid[i][j];
        grid[i][j] = '#';

        boolean found = dfs(grid, word, i + 1, j, k + 1) ||
                        dfs(grid, word, i - 1, j, k + 1) ||
                        dfs(grid, word, i, j + 1, k + 1) ||
                        dfs(grid, word, i, j - 1, k + 1);

        grid[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'C','A','T','S'},
            {'O','R','E','A'},
            {'D','E','A','M'},
            {'E','L','L','S'}
        };

        String word = "DREAM";

        boolean result = false;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, word, i, j, 0)) {
                    result = true;
                }
            }
        }

        System.out.println("Word Found: " + result);
    }
}