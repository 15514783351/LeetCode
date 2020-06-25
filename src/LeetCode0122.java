
// 买卖股票的最佳时机2
public class LeetCode0122 {
    public int maxProfit(int[] prices) {
//        int res = 0;
//        int m = prices.length;
//        if (m <=1) return 0;
//        for (int i = 0; i < m - 1; i++) {
//            for (int j = i + 1; j < m; j++) {
//                if (prices[j] < prices[i]) {
//                    i = j - 1;
//                    break;
//                } else if (j < m - 1 && prices[j] > prices[i] && prices[j] > prices[j + 1]) {
//                    res = res + prices[j] - prices[i];
//                    i = j;
//                    break;
//                } else if (j == m - 1) return res + prices[j] - prices[i];
//            }
//        }
//        return res;

        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) res += prices[i] - prices[i - 1];
        }
        return res;
    }
}
