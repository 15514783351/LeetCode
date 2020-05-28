import java.util.Arrays;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/28 19:36   戴宗明       1.0         None
 */

// 数组拆分
public class LeetCode0561 {
    public int arrayPairSum(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] >= nums[j + 1]) {
//                    int temp = nums[j + 1];
//                    nums[j + 1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            res += nums[2 * i];
        }
        return res;
    }
}
