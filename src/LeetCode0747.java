/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/24 19:46   戴宗明       1.0         None
 */

// 是少是其他数字两倍的最大数
public class LeetCode0747 {
    public int dominantIndex(int[] nums) {
        int first = 0;
        int index = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) second = nums[i];
        }
        return 2 * second <= first ? index : -1;
    }
}
