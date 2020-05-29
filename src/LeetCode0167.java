/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/29 19:34   戴宗明       1.0         None
 */

//两数之和2-输入有序数组
public class LeetCode0167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num == target) {
                return new int[]{left + 1, right + 1};
            } else if (num < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}
