import java.util.LinkedList;

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
//        int left = 0;
//        int right = 0;
//        int res = Integer.MAX_VALUE;
//        int sum = 0;
//        while (right < nums.length) {
//            sum += nums[right];
//            right++;
//            while (sum >= s) {
//                res = Math.min(res, right - left);
//                sum -= nums[left];
//                left++;
//            }
//        }
//        return res == Integer.MAX_VALUE ? 0 : res;

        LinkedList<Integer> queue = new LinkedList<>();
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;
        for (int num: nums) {
            sum += num;
            queue.addLast(num);
            while (sum >= s) {
                res = Math.min(res, queue.size());
                sum -= queue.pollFirst();
            }
        }
        return res < Integer.MAX_VALUE ? res : 0;
    }
}
