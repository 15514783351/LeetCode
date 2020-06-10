import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/10 20:27   戴宗明       1.0         None
 */

//字符串中的第一个唯一字符
public class LeetCode0387 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (char c: s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, 2);
            }
        }
        for (char c: hashMap.keySet()) {
            if (hashMap.get(c) == 1) {
                return s.indexOf(String.valueOf(c));
            }
        }

        return -1;
    }
}
