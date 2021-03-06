import java.util.ArrayList;
import java.util.List;

public class LeetCode0131 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s, 0, new ArrayList<>());


        return res;
    }

    private void backtrack(String s, int start, List<String> combination) {
        if (start == s.length()) {
            res.add(new ArrayList<>(combination));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isCycle(s.substring(start, i + 1))) {
                    combination.add(s.substring(start, i + 1));
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
