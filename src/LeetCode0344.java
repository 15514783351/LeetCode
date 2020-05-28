/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/27 22:01   戴宗明       1.0         None
 */


public class LeetCode0344 {
    public void reverseString(char[] s) {
        int length = s.length;
        int j = length - 1;
        int i = 0;
        while (i < j) {
            char c = s[j];
            s[j] = s[i];
            s[i] = c;
            i++;
            j--;
        }
    }

}
