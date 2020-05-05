import java.util.ArrayList;
import java.util.List;

public class LeetCode0140 {
    // 回溯法 超出时间限制
    public List<List<String>> output = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (!isWordBreak(s, wordDict)) return new ArrayList<>();
        backtrack(0, s, wordDict, new ArrayList<>());
        List<String> res = new ArrayList<>();
        for (List<String> combination: output) {
            String strs = "";
            for (String com: combination) {
                strs = strs + " " + com;
            }
//            System.out.println(strs);
            res.add(strs.substring(1));
        }
//        System.out.println(output);
        return res;
    }

    private boolean isWordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length + 1; j++) {
                if (dp[i] && wordDict.contains(s.substring(i, j))) dp[j] = true;
                if (dp[length]) return true;
            }
        }
        return dp[length];
    }


    private void backtrack(int start, String s, List<String> wordDict, List<String> combination) {
        if (start == s.length()) {
            output.add(new ArrayList<>(combination));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (wordDict.contains(s.substring(start, i + 1))) {
                    combination.add(s.substring(start, i + 1));
                    backtrack(i + 1, s, wordDict, combination);
                    combination.remove(combination.size() - 1);
                }
            }
        }
    }
}
