/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/27 22:01   戴宗明       1.0         None
 */

// 反转字符串
public class LeetCode0344 {
    public void reverseString(char[] s) {
        // int length = s.length;
        // int j = length - 1;
        // int i = 0;
        // while (i < j) {
        //     char c = s[j];
        //     s[j] = s[i];
        //     s[i] = c;
        //     i++;
        //     j--;
        // }

        helper(s, 0, s.length - 1);
    }

    private void helper(char[] s, int start, int end) {
        if (start < end) {
            char c = s[end];
            s[end] = s[start];
            s[start] = c;
            helper(s, start + 1, end - 1);
        }

    }

}
