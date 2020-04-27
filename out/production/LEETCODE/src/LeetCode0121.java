public class LeetCode0121 {
    public int maxProfit(int[] prices) {
        int m = prices.length;
        if (m <= 1) return 0;
        int res = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }
}
