/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/5 19:00   戴宗明       1.0         None
 */

// 通配符匹配
public class LeetCode0044 {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];  // [i][j] 表示s的前i个字符能不能被p的前j个字符匹配
        dp[0][0] = true;
        for (int i = 1; i < s.length() + 1; i++) dp[i][0] = false;
        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*' && dp[0][i - 1]) dp[0][i] = true;
        }
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                if (dp[i - 1][j] && p.charAt(j - 1) == '*') dp[i][j] = true;
                else if (dp[i][j - 1] && p.charAt(j - 1) == '*') dp[i][j] = true;
                else if (dp[i - 1][j - 1] && p.charAt(j - 1) == '*') dp[i][j] = true;
                else if (s.charAt(i - 1) == p.charAt(j - 1) && dp[i - 1][j - 1]) dp[i][j] = true;
                else if (p.charAt(j - 1) == '?' && dp[i - 1][j - 1]) dp[i][j] = true;
                else if (p.charAt(j - 1) != s.charAt(i - 1)) break;
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        LeetCode0044 leetCode0044 = new LeetCode0044();
        System.out.println(leetCode0044.isMatch("acdcb", "a*cd?b"));
    }
}
