
// 不同的二叉搜索树
public class LeetCode0096 {
    public int numTrees(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int res = 0;
        int[] dp = new int[n];  // dp[i]表示i个数字可组成的树的种类
        dp[0] = 1;
        // 得出长度为1-  (n - 1) 所组成的不同的树的种类
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];  // 左边有 j- 1个 右边有 i-j个数字组成的
            }
        }
        for (int i = 1; i < n + 1; i++) {
            res += dp[i - 1] * dp[n - i];
        }
        return res;
    }
}
