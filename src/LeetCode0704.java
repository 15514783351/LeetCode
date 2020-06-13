/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/13 19:51   戴宗明       1.0         None
 */

// 二分查找
public class LeetCode0704 {
        public int search(int[] nums, int target) {
            int end = nums.length - 1;
            int start = 0;
            if (nums[end] < target || nums[0] > target) return -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
            return -1;
        }
}
