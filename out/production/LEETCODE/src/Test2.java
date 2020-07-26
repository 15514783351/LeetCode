import java.util.Arrays;
import java.util.Scanner;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/22 14:58   戴宗明       1.0         None
 */


public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int[] sorted = new int[n];
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                nums[i] = num;
                sorted[i] = num;
            }
            Arrays.sort(sorted);
            int count = 0;
            int index = getIndex(nums, sorted[n - 1]);  // 最大值的index
            int start = n - 1;
            for (int i = index; i >= 0; i--) {
                if (nums[i] == sorted[start]) {
                    count++;
                    start--;
                }
            }
            System.out.println(n - count);
            return;

        }
    }

    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;//如果未找到返回-1
    }
}
