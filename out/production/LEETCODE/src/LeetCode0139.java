import java.util.List;

public class LeetCode0139 {
    // 回溯法超市
//    public boolean res = false;
//    public boolean wordBreak(String s, List<String> wordDict) {
//        backtrack(0, wordDict, s);
//        return res;
//    }
//
//    private void backtrack(int start, List<String> wordDict, String s) {
//        if (start == s.length()) {
//            res = true;
//        } else {
//            for (int i = start; i < s.length(); i++) {
//                if (wordDict.contains(s.substring(start, i + 1))) backtrack(i + 1, wordDict, s);
//            }
//        }
//    }

    // 动态规划法 dp[i]: s的前i个字母能在wordDict中表示
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (dp[i] && wordDict.contains(s.substring(i, j))) dp[j] = true;
            }
        }
        return dp[s.length()];
    }
}
