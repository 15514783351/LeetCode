import java.util.LinkedList;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/31 19:18   戴宗明       1.0         None
 */

// 反转字符串中的单词3
public class LeetCode0557 {
    public String reverseWords(String s) {
        LinkedList<String> cur = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c != ' ') {
                cur.addLast(String.valueOf(c));
            } else if (c == ' ') {
                while (!cur.isEmpty()) {
                    sb.append(cur.pollLast());
                }
                sb.append(" ");
            }
        }
        while (!cur.isEmpty()) {
            sb.append(cur.pollLast());
        }
        return sb.toString();
    }
}
