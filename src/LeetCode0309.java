/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/10 19:29   戴宗明       1.0         None
 */

// 最佳买卖浮漂时机含冷冻期
public class LeetCode0309 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int[][] dp = new int[prices.length][3];  // dp[i] 表示第i天收入 0:持有1:冷冻期 2:不持有，也不处于冷冻期
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }

        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
    }
}
