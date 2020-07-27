/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/27 20:12   戴宗明       1.0         None
 */

// 判断子序列
public class LeetCode0392 {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        boolean[][] dp = new boolean[m + 1][n + 1];   // dp[i][j] 表示s的钱i个事t的前j个的子序列
        dp[0][0] = true;
        for (int i = 1; i < m + 1; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i < n + 1; i++) {
            dp[0][i] = true;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    for (int k = i; k <= j; k++) {
                        dp[i][j] = dp[i][j] || dp[i][k];
                        if (dp[i][j]) break;
                    }
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        LeetCode0392 leetCode0392 = new LeetCode0392();
        System.out.println(leetCode0392.isSubsequence("axc", "ahbgdc"));
    }
}
