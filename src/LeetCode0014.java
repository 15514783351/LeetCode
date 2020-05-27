/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/27 20:39   戴宗明       1.0         None
 */

// 最长公共前缀
public class LeetCode0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < length) length = strs[i].length();
        }
        StringBuilder sb = new StringBuilder();
        f: for (int i = 0; i < length; i++) {
            char c = strs[i].charAt(i);
            boolean equal = false;
            for (int j = 1; j < strs.length; j++) {
                if (c == strs[j].charAt(i)) {
                    equal = true;
                } else break f;
            }
            if (equal) sb.append(String.valueOf(c));
        }



        return sb.toString();
    }
}
