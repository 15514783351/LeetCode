import java.util.HashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/3 20:33   戴宗明       1.0         None
 */

// 将整数按权重排序
public class LeetCode1387 {
    HashMap<Integer, Integer> visited = new HashMap<>();
    public int getKth(int lo, int hi, int k) {
        int[] steps = new int[hi - lo + 1];
        for (int i = lo; i <= hi; i++) {
            visited.put(i, getStep(i));
            steps[i - lo] = visited.get(i);
        }
        System.out.println(visited);
        int[] nums = new int[steps.length];
        for (int i = 0; i < steps.length; i++) nums[i] = lo + i;
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps.length - i - 1; j++) {
                if (steps[j + 1] > steps[j]) {
                    int temp = steps[j + 1];
                    steps[j + 1] = steps[j];
                    steps[j] = temp;

                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums[k - 1];

    }

    private int getStep(int num) {
        int step = 0;
        while (num > 1) {
            step++;
            if (num % 2 == 0) {
                num = num / 2;

            } else {num = 3 * num + 1;}

            if (visited.containsKey(num)) {
                return step + visited.get(num);
            } else {
                visited.put(num, getStep(num));
            }
        }
        return step;
    }

    public static void main(String[] args) {
        LeetCode1387 leetCode1387 = new LeetCode1387();
        leetCode1387.getKth(12, 15, 2);
    }
}
