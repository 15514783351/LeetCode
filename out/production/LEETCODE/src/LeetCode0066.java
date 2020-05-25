import java.util.Arrays;

public class LeetCode0066 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] res = new int[length + 1];

        int num = digits[length - 1] + 1;
        int add = num > 9 ? 1 : 0;
        if (length == 1) {
            if (add == 1) return new int[]{1, num % 10};
            else return new int[]{num};
        }
        res[length] = num % 10;
        for (int i = length - 2; i >= 0; i--) {
            num = digits[i]  + add;
            if (num <= 9) {
                res[i + 1] = num;
                add = 0;
            } else {
                res[i + 1] = 0;
                add = 1;
            }
        }
        if (add == 1) {
            res[0] = 1;
            return res;
        } else {
            int[] a = new int[length];
            System.arraycopy(res, 1, a, 0, length);
            return a;
        }
    }
}
