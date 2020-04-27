import java.util.ArrayList;
import java.util.List;

public class LeetCode0078 {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n + 1; i++) {
            backtrack(new ArrayList<>(), n, i, 0, nums);
        }
        return output;
    }

    public void backtrack(List combination, int n,  int k, int start, int[] nums) {
        if (combination.size() == k) {
            output.add(new ArrayList<>(combination));
        } else {
            for (int i = start; i < n; i++) {
                combination.add(nums[i]);
                backtrack(combination, n, k, i + 1, nums);
                combination.remove(combination.size() - 1);
            }
        }
    }

}
