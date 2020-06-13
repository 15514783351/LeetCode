/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/9 19:30   戴宗明       1.0         None
 */

// 两数之和
public class LeetCode0001 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i =0; i < nums.length - 1; i++) {
            res[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                res[1] = j;
                if (nums[i] + nums[j] == target) return res;
            }
        }
        return new int[2];
    }
}
