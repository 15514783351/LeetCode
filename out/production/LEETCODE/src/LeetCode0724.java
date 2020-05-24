import java.util.Arrays;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/24 19:11   戴宗明       1.0         None
 */


public class LeetCode0724 {
    public int pivotIndex(int[] nums) {
        if (nums.length <= 1) return -1;
        for (int i = 0; i < nums.length; i++) {
            if (sum(nums, 0, i) == sum(nums, i + 1, nums.length)) return i;
        }
        return -1;
    }

    private int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
