/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/30 17:38   戴宗明       1.0         None
 */

// 整数拆分
public class LeetCode0343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1]; // dp[i]表示i最大的乘机和
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int res = 0;
            for (int j = 1; j < i; j++) {
                res = Math.max(res, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = res;
        }
        return dp[n];
    }
}
