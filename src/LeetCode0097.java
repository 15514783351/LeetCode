public class LeetCode0097 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int length1 = s1.length();
        int length2 = s2.length();
        boolean[][] dp = new boolean[length1 + 1][length2 + 1];   // dp[i][j]: s1的前i个和s2的前j个组成s3的前i + j个
        if (length1 + length2 != s3.length()) return false;
        dp[0][0] = true;
        for (int i = 0; i < length1; i++) {
            if (s1.charAt(i) != s3.charAt(i)) {
                break;
            } else dp[i + 1][0] = (s1.charAt(i) == s3.charAt(i)) && dp[i][0];
        }
        for (int i = 0; i < length2; i++) {
            if (s2.charAt(i) != s3.charAt(i)) {
                break;
            } else dp[0][i + 1] = (s2.charAt(i) == s3.charAt(i)) && dp[0][i];
        }
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                dp[i][j] = dp[i-1][j] && s1.charAt(i - 1) == s3.charAt(i-1+j) || dp[i][j-1] && s2.charAt(j - 1) == s3.charAt(i-1+j);
            }
        }
        return dp[length1][length2];
    }
}
