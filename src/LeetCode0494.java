import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/19 9:12   戴宗明       1.0         None
 */

//目标和
public class LeetCode0494 {
    private int step;
    public int findTargetSumWays(int[] nums, int S) {
        int length = nums.length;
        if (length == 0) return -1;
        dfs(nums, S, 0, 0);

        return step;
    }

    private void dfs(int[] nums, int target, int sum, int start) {
        if (start == nums.length) {
            if (sum == target)
                step++;
        } else {
            dfs(nums, target, sum + nums[start], start + 1);
            dfs(nums, target, sum - nums[start], start + 1);
        }
    }
}
