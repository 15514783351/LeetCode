/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2022/1/4 22:42   戴宗明       1.0         None
 */
// 计算乘法运算的最大分数
public class LeetCode1770 {
    int score = 0;
    public int maximumScore(int[] nums, int[] multipliers) {
        int left = 0;
        int right = nums.length - 1;
        helper(nums, multipliers, 1, left, right, -1, 0 + nums[right] * multipliers[0]);
        helper(nums, multipliers, 1, left, right, 1, 0 + nums[left] * multipliers[0]);
        return score;
    }

    public void helper(int[] nums, int[] multipliers, int index, int left, int right, int direction, int s) {  // direction:1: 取头， -1 取尾
        if (index == multipliers.length) {
            if (s > score) {
                score = s;
            }
            return;
        }
        if (direction == -1) {
            s = s + nums[right - 1] * multipliers[index];
            helper(nums, multipliers, index + 1, left, right - 1, -1, s);
            helper(nums, multipliers, index + 1, left + 1, right, 1, s);
        } else if (direction == 1) {
            s = s + nums[left + 1] * multipliers[index];
            helper(nums, multipliers, index + 1, left, right - 1, -1, s);
            helper(nums, multipliers, index + 1, left + 1, right, 1, s);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] multiplies = {3};
        LeetCode1770 leetCode1770 = new LeetCode1770();
        int score = leetCode1770.maximumScore(nums, multiplies);
        System.out.println(score);

    }


}
