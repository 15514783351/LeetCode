/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/29 20:12   戴宗明       1.0         None
 */


public class LeetCode0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                k++;
            } else {
                res = Math.max(k, res);
                k = 0;
            }
        }
        return Math.max(k, res);
    }
}
