import java.util.ArrayList;
import java.util.List;

public class LeetCode0130 {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        List<int[]> xyList = new ArrayList<>();
        int[] xy = {0, 0};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    xy[0] = i;
                    xy[1] = j;
                    xyList.add(new int[] {xy[0], xy[1]});
                }
            }
        }
        List<int[]> xyListNoSurrounded = new ArrayList<>();
        // 先把边界的放进去
        for (int[] num: xyList) {
            if (num[0] == 0 || num[0] == m - 1 || num[1] == 0 || num[1] == n - 1)
                xyListNoSurrounded.add(num);
        }

        for (int i = 0; i < xyList.size(); i++) {
            if (!xyListNoSurrounded.contains(xyList.get(i))) {
                for (int j = 0; j < xyListNoSurrounded.size(); j++) {
                    int[] num1 = xyListNoSurrounded.get(j);
                    if ((Math.abs(xyList.get(i)[0] - num1[0]) == 1 && xyList.get(i)[1] == num1[1]) ||
                            (Math.abs(xyList.get(i)[1] - num1[1]) == 1 && xyList.get(i)[0] == num1[0])) {
                        xyListNoSurrounded.add(xyList.get(i));
                        i = -1;
                        break;
                    }
                }
            }
        }

        for (int[] num: xyList) {
            if (!xyListNoSurrounded.contains(num))
                board[num[0]][num[1]] = 'X';
        }


    }
}
