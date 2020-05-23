import java.util.LinkedList;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/22 20:26   戴宗明       1.0         None
 */


public class LeetCode0572 {
//    private int[][] matrix;
//    private int m, n;
//    private int[][] directions = {{-1, 0},
//            {1, 0},
//            {0, 1},
//            {0, -1}};
//    public int[][] updateMatrix(int[][] matrix) {
//        m = matrix.length;
//        n = matrix[0].length;
//        int[][] res = new int[m][n];
//        this.matrix = matrix;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                res[i][j] = bfs(i, j);
//            }
//        }
//        return res;
//    }
//
//    private int bfs(int row, int column) {
//        if (matrix[row][column] == 0) return 0;
//        LinkedList<int[]> queue = new LinkedList<>();
//        int step = 0;
//        queue.addLast(new int[]{row, column});
//        boolean[][] used = new boolean[m][n];
//        while (!queue.isEmpty()) {
//            step++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                int[] ints = queue.pollFirst();
//                for (int[] dir: directions) {
//                    int a = ints[0] + dir[0];
//                    int b = ints[1] + dir[1];
//                    if (a >= 0 && a < m && b >= 0 && b < n && !used[a][b]) {
//                        if (matrix[a][b] == 0) return step;
//                        else {
//                            queue.addLast(new int[]{a, b});
//                            used[a][b] = true;
//                        }
//                    }
//                }
//            }
//        }
//        return step;
//    }

    public int[][] updateMatrix(int[][] matrix) {
        // 首先将所有的 0 都入队，并且将 1 的位置设置成 -1，表示该位置是 未被访问过的 1
        LinkedList<int[]> queue = new LinkedList<>();
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                // 如果四邻域的点是 -1，表示这个点是未被访问过的 1
                // 所以这个点到 0 的距离就可以更新成 matrix[x][y] + 1。
                if (newX >= 0 && newX < m && newY >= 0 && newY < n
                        && matrix[newX][newY] == -1) {
                    matrix[newX][newY] = matrix[x][y] + 1;
                    queue.offer(new int[] {newX, newY});
                }
            }
        }

        return matrix;
    }
}
