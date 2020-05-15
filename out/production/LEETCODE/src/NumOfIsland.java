import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/15 16:40   戴宗明       1.0         None
 */

// 岛屿的数量
public class NumOfIsland {
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
//        List<int[]> used = new ArrayList<>();

        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    queue.offer(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] xy = queue.poll();
                        for (int[] dir: dirs) {
                            int x = xy[0] + dir[0];
                            int y = xy[1] + dir[1];
                            if (x >= 0 && x < m && y >=0 && y < n && grid[x][y] == '1') {

                                queue.offer(new int[]{x, y});
                                grid[x][y] = '0';

                            }
                        }
                    }
                    res++;
                }
            }
        }
        return res;
    }
}
