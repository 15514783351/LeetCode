/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/30 14:54   戴宗明       1.0         None
 */

//长度最小的连续子数组
public class LeetCode0209 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (right < nums.length) {
            System.out.println("" + left + " " + right);
            if (sum < s) {
                sum += nums[right];
                right++;
            } else {
                res = Math.min(res, right - left - 1);
                sum -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
