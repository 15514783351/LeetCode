public class LeetCode0079 {
    int m;
    int n;
    int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean[][] marked;
    char[][] board;
    String word;
    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        this.marked = new boolean[m][n];
        this.board = board;
        this.word = word;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtrack(i, j, 0)) return true;
            }
        }
        return false;
    }


    // i j 表明 board中 ij 与word对应的字符
    public boolean backtrack(int i, int j, int start) {
        if (word.length() == start + 1) {
            return board[i][j] == word.charAt(start);
        } else {
            if (board[i][j] == word.charAt(start)) {
                marked[i][j] = true;
                for (int k = 0; k < 4; k++) {
                    int newX = i + direction[k][0];
                    int newY = j + direction[k][1];
                    if (inArea(newX, newY) && !marked[newX][newY]) {
                        if (backtrack(newX, newY, start + 1)) {
                            return true;
                        }
                    }
                }
                marked[i][j] = false;
            }

        }


        return false;
    }


    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
