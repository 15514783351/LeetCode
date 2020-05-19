/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/18 16:33   戴宗明       1.0         None
 */

//岛屿数量
public class LeetCode0200 {
    private int row, column;
    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid.length == 0 || grid[0].length == 0) return 0;
        this.row = grid.length;
        this.column = grid[0].length;
        boolean[][] visited = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, boolean[][] visited, int row, int column) {
        if (row >= 0 && row < this.row && column >= 0 && column < this.column && grid[row][column] == '1' && !visited[row][column]) {
            visited[row][column] = true;
            dfs(grid, visited, row - 1, column);
            dfs(grid, visited, row + 1, column);
            dfs(grid, visited, row, column + 1);
            dfs(grid, visited, row, column - 1);
        }
    }
}
