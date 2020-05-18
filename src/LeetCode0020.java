import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/18 11:04   戴宗明       1.0         None
 */

//有效的括号
public class LeetCode0020 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        s = s.trim();
        boolean res = false;
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        if (length % 2 == 1) return false;
        if (length == 0) return true;
        if (map.get(s.charAt(0)) == null) return false;

        for (int i = 0; i < length; i++) {
            if (map.get(s.charAt(i)) != null) {
                stack.push(s.charAt(i));
                res = false;
            } else {
                char left = stack.pop();
                if (map.get(left) != s.charAt(i)) {
                    res = false;
                    return res;
                } else res = true;
            }

        }
        return res;
    }
}
