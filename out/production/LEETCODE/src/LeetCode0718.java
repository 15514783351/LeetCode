/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/1 19:32   戴宗明       1.0         None
 */

// 最长重复子数组
public class LeetCode0718 {
    // 动态规划
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];  // 表示A从i开始，b从j开始对其的数字
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[0]) dp[i][0] = 1;
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] == A[0]) dp[0][i] = 1;
        }
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {8};
        int[] B = {3, 2, 1, 0, 4, 7};
        LeetCode0718 leetCode0718 = new LeetCode0718();
        System.out.println(leetCode0718.findLength(A, B));
    }
}
