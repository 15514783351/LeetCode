import java.lang.management.BufferPoolMXBean;
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
//        int num = 0;
//        LinkedList<Integer> stackNum = new LinkedList<>();
//        LinkedList<String> stackString = new LinkedList<>();
//        for (Character c : s.toCharArray()) {
//            if(c == '[') {
//                stackNum.addLast(num);
//                stackString.addLast(res.toString());
//                num = 0;
//                res = new StringBuilder();
//            }
//            else if(c == ']') {
//                res = new StringBuilder(stackString.removeLast() + String.valueOf(res).repeat(stackNum.removeLast()));
//            }
//            else if(c >= '0' && c <= '9') num = num* 10 + Integer.parseInt(c + "");
//            else res.append(c);
//        }
//        return res.toString();
        StringBuffer res = new StringBuffer();
        LinkedList<Integer> stackNum = new LinkedList<>();
        LinkedList<String> stackString = new LinkedList<>();
        int num = 0;
        for (Character c: s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == ']') {
                res = new StringBuffer(stackString.pollLast() + res.toString().repeat(stackNum.pollLast()));
            } else if (c == '[') {
                stackNum.addLast(num);
                stackString.addLast(res.toString());
                num = 0;
                res = new StringBuffer();
            } else {
                res.append(c);
            }
        }
        
        return res.toString();

    }
}
