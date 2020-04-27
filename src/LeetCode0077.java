import java.util.*;
class LeetCode0077 {
    List<List<Integer>> output = new ArrayList<>();
    int n;
    int k;
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(new ArrayList<>(), 1);
        return output;
    }

    public void backtrack(List combination, int start) {
        if (combination.size() == k) {
            output.add(new ArrayList<>(combination));
        } else {
            for (int i = start; i <= n; i++) {
                combination.add(i);
                backtrack(combination, i + 1);
                combination.remove(combination.size() - 1);
            }
        }
    }
}