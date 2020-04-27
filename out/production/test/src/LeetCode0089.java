import java.util.ArrayList;
import java.util.List;

public class LeetCode0089 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 0) {
            res.add(0);
            return res;
        }
        String[] temp = {"0", "1"};
        for (int i = 2; i <= n; i++) {
            String[] str = new String[(int)Math.pow(2, i)];
            for (int j = 0; j < temp.length; j++) {
                str[j] = "0" + temp[j];
            }
            for (int j = temp.length - 1; j >= 0; j--) {
                str[2 * temp.length - 1 - j] = "1" + temp[j];
            }
            temp = str;
        }
        for (String s: temp) {
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i+ 1).equals("1")) num += (int) Math.pow(2, s.length() - 1 - i);
            }
            res.add(num);
        }
        return res;
    }
}
