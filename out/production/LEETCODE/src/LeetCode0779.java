import java.util.LinkedList;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/24 20:19   戴宗明       1.0         None
 */

// 第K个语法符号
public class LeetCode0779 {
    public int kthGrammar(int N, int K) {
//        LinkedList<Integer> l1 = new LinkedList<>();
//        LinkedList<Integer> l2 = new LinkedList<>();
//        l1.addLast(0);
//        for (int i = 0; i < N - 1; i++) {
//            int size = l1.size();
//            l2 = new LinkedList<>(l1);
//            for (int j = 0; j < size; j++) {
//                Integer integer = l2.pollFirst();
//                if (integer == 0) {
//                    l1.addLast(1);
//                } else if (integer == 1) {
//                    l1.addLast(0);
//                }
//            }
//        }
//
//        int res = 0;
//        for (int i = 0; i < K; i++) {
//            res = l1.pollFirst();
//        }
//        return res;

        int[][] dp = new int[N][(int)Math.pow(2, N - 1)];
        dp[0][0] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < (int)Math.pow(2, i); j++) {
                int mid = (int) Math.pow(2, i) / 2;
                if (j < mid) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = 1 - dp[i - 1][j - mid];
            }
        }
        return dp[N - 1][K - 1];

    }
}
