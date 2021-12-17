/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2021/12/17 21:08   戴宗明       1.0         None
 */
// 甲板上的战舰
public class LeetCode0419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X' && !visited[i][j]) {
                    count++;
                    for (int k = i; k < m; k++) {
                        if (board[k][j] == 'X') {
                            visited[k][j] = true;
                        } else break;
                    }
                    for (int k = j; k < n; k++) {
                        if (board[i][k] == 'X') {
                            visited[i][k] = true;
                        } else break;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        LeetCode0419 leetCode0419 = new LeetCode0419();
        char[][] board = {{'X', '.', '.', 'X'},
                            {'.', '.', '.', '.'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', '.'}};
        System.out.println(leetCode0419.countBattleships(board));
    }
}
