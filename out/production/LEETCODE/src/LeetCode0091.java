public class LeetCode0091 {
    public int numDecodings(String s) {
        int length = s.length();
        if (s.substring(0, 1).equals("0")) return 0;
        if (length == 1) return 1;
        int[] dp = new int[s.length() + 1];  // dp[i] 表示s字符从第一个到第i个的解码个数
        dp[0] = 0;
        dp[1] = 1;
        if (Integer.parseInt(s.substring(0, 2)) <= 26 &&
                (Integer.parseInt(s.substring(0, 2)) != 10) &&
                (Integer.parseInt(s.substring(0, 2)) != 20)) {
            dp[2] = 2;
        } else if (Integer.parseInt(s.substring(0, 1)) > 2 && (Integer.parseInt(s.substring(1, 2)) == 0)) {
            return 0;
        } else dp[2] = 1;
        for (int i = 3; i < length + 1; i++) {
            if (Integer.parseInt(s.substring(i - 2, i - 1)) == 0 && (Integer.parseInt(s.substring(i - 1, i)) == 0)) {
                return 0;
            } else if (Integer.parseInt(s.substring(i - 1, i)) == 0 && (Integer.parseInt(s.substring(i - 2, i - 1)) > 2)) {
                return 0;
            } else if (Integer.parseInt(s.substring(i - 2, i - 1)) == 0) {
                dp[i] = dp[i - 1];
            } else if (Integer.parseInt(s.substring(i - 1, i)) == 0) {
                dp[i] = dp[i - 2];
            } else if (Integer.parseInt(s.substring(i - 2, i)) <= 26) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else dp[i] = dp[i - 1];
        }

        return dp[length];

    }
}
