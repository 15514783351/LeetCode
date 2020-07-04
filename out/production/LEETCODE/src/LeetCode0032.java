import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/4 19:44   戴宗明       1.0         None
 */

// 最长有小括号
public class LeetCode0032 {
    public int longestValidParentheses(String s) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Character> parent = new LinkedList<>();
        int[] isOK = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (linkedList.isEmpty() || s.charAt(i) == '(') {
                parent.addLast(s.charAt(i));
                linkedList.addLast(i);
            } else {
                if (parent.peekLast() == '(') {
                    isOK[linkedList.pollLast()] = 1;
                    isOK[i] = 1;
                }
            }
        }
        int length = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isOK[i] == 0) {
                res = Math.max(res, length);
                length = 0;
            } else {
                length++;
            }
        }
        return Math.max(length, res);
    }

    public static void main(String[] args) {
        LeetCode0032 leetCode0032 = new LeetCode0032();
        leetCode0032.longestValidParentheses(")()())");
    }
}
