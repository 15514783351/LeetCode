import java.util.ArrayList;
import java.util.List;

public class LeetCode0132 {
    int[] cut = {Integer.MAX_VALUE};
    public int minCut(String s) {
        backtrack(s, 0, new ArrayList<>());
        return cut[0];
    }

    private void backtrack(String s, int start, List<String> combination) {
        if (start == s.length()) {
            int l = combination.size() - 1;
            if (l < cut[0]) cut[0] = l;
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isCycle(s.substring(start, i + 1))) {
                    combination.add("a");
                    backtrack(s, i + 1, combination);
                    combination.remove(combination.size() - 1);
                }
            }
        }
    }

    private boolean isCycle(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
