import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/20 20:39   戴宗明       1.0         None
 */

// 字符串解码
public class LeetCode0394 {
    public String decodeString(String s) {
//        StringBuilder res = new StringBuilder();
//        int multi = 0;
//        LinkedList<Integer> stack_multi = new LinkedList<>();
//        LinkedList<String> stack_res = new LinkedList<>();
//        for (Character c : s.toCharArray()) {
//            if(c == '[') {
//                stack_multi.addLast(multi);
//                stack_res.addLast(res.toString());
//                multi = 0;
//                res = new StringBuilder();
//            }
//            else if(c == ']') {
//                StringBuilder tmp = new StringBuilder();
//                int cur_multi = stack_multi.removeLast();
//                for (int i = 0; i < cur_multi; i++) tmp.append(res);
//                res = new StringBuilder(stack_res.removeLast() + tmp);
//            }
//            else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
//            else res.append(c);
//        }
//        return res.toString();

        StringBuffer res = new StringBuffer();
        LinkedList<Integer> stackNum = new LinkedList<>();
        LinkedList<String> stackString = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                stackNum.addLast(s.charAt(i) + '0');
            }
            if (s.charAt(i) == '[') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ']') {
                        stackString.addLast(s.substring(i + 1, j + 1));
                        break;
                    }
                }
            }
        }

    }
}
