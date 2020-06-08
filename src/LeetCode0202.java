import java.util.HashSet;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/8 20:04   戴宗明       1.0         None
 */

// 快乐数
public class LeetCode0202 {
    public boolean isHappy(int n) {
        Set<Integer> used = new HashSet<>();
        String numToString;
        while (n != 1) {
            if (used.contains(n)) return false;
            used.add(n);
            numToString = "" + n;
            n = 0;
            for (char c: numToString.toCharArray()) {
                n += (c - '0') * (c - '0');
            }
            numToString = "";
        }
        return true;
    }
}
