/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/27 20:02   戴宗明       1.0         None
 */


public class LeetCode0028 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int length1 = haystack.length();
        int length2 = needle.length();
        if (length1 < length2) return -1;
        if (haystack.equals(needle)) return 0;
        boolean isOk = false;
        for (int i = 0; i < length1 - length2 + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < length2; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        isOk = false;
                        break;
                    } else isOk = true;
                }
                if (isOk) return i;
            }
        }
        return -1;
    }
}
