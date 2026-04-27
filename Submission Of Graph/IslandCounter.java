public class IslandCounter {

    static int[][] grid = {
        {1,1,0,0,0},
        {1,1,0,0,1},
        {0,0,1,0,1},
        {0,0,0,1,1}
    };

    static int m = grid.length;
    static int n = grid[0].length;

    public static void main(String[] args) {
        System.out.println("Islands: " + countIslands());
    }

    static int countIslands() {
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m || j >= n ||
            grid[i][j] == 0 || visited[i][j]) return;

        visited[i][j] = true;

        dfs(i+1, j, visited);
        dfs(i-1, j, visited);
        dfs(i, j+1, visited);
        dfs(i, j-1, visited);
    }
}