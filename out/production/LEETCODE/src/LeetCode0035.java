/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/17 20:07   戴宗明       1.0         None
 */

// 搜素插入的位置
public class LeetCode0035 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target > nums[nums.length - 1]) return nums.length;
        if (target == nums[nums.length - 1]) return nums.length - 1;
        if (target <= nums[0]) return 0;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return nums[left] >= target ? left : left + 1;
    }
}
