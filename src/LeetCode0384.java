import java.util.Arrays;
import java.util.Random;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2021/12/12 19:59   戴宗明       1.0         None
 */

// 打乱数组
public class LeetCode0384 {
    int[] original;
    public LeetCode0384(int[] nums) {
        original = nums;
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        int[] temp = Arrays.copyOf(original, original.length);
        Random random = new Random();
        int length = original.length;
        int[] res = new int[length];
        int k = 0;
        int right = length - 1;
        for (int i = 0; i < length; i++) {
            int nextInt = random.nextInt(length - i);
            res[k++] = temp[nextInt];
            temp[nextInt] = temp[right--];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        LeetCode0384 leetCode0384 = new LeetCode0384(arr);
        leetCode0384.reset();
        leetCode0384.shuffle();

    }
}
