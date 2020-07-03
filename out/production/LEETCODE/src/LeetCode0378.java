import java.util.Arrays;
import java.util.HashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/2 19:27   戴宗明       1.0         None
 */

// 有序剧真中第K小的元素
public class LeetCode0378 {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int[] nums = new int[m * m];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) nums[index++] = matrix[i][j];
        }
        Arrays.sort(nums);
        return nums[k - 1];
    }
}
