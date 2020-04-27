import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0090 {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        output.add(new ArrayList<>());
        for (int i = 0; i <= nums.length; i++)
            backtrack(nums, new ArrayList<>(), 0, i);
        return output;
    }

    public void backtrack(int[] nums, List<Integer> subset, int start, int length) {
        if (!output.contains(subset) && subset.size() == length) {
            output.add(new ArrayList<>(subset));
        } else {
            for (int i = start; i < nums.length; i++) {
                subset.add(nums[i]);
                backtrack(nums, subset, i + 1, length);
                subset.remove(subset.size() - 1);
            }
        }
    }
}
