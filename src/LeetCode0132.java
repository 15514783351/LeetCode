import java.util.ArrayList;
import java.util.List;

public class LeetCode0132 {
    public int minCut(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }

        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = i;
        }

        for (int i = 1; i < len; i++) {
            if (isCycle(s.substring(0, i + 1))) {
                dp[i] = 0;
                continue;
            }
            // 当 j == i 成立的时候，s[i] 就一个字符，一定是回文
            // 因此，枚举到 i - 1 即可
            for (int j = 0; j < i; j++) {
                if (isCycle(s.substring(j + 1, i + 1))) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[len - 1];
    }


//    private void backtrack(String s, int start, List<String> combination) {
//        if (start == s.length()) {
//            int l = combination.size() - 1;
//            if (l < cut[0]) cut[0] = l;
//        } else {
//            for (int i = start; i < s.length(); i++) {
//                if (isCycle(s.substring(start, i + 1))) {
//                    combination.add("a");
//                    backtrack(s, i + 1, combination);
//                    combination.remove(combination.size() - 1);
//                }
//            }
//        }
//    }

    private boolean isCycle(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
