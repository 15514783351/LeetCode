/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/30 15:54   戴宗明       1.0         None
 */

//旋转数组
public class LeetCode0189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = nums[length - 1];
            for (int j = length - 1; j > 0; j--) nums[j] = nums[j - 1];
            nums[0] = temp;
        }

    }
}
