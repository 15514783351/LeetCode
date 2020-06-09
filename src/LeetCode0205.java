import java.util.HashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/9 19:40   戴宗明       1.0         None
 */

// 同构字符串
public class LeetCode0205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // 判断哈希是否包含s的key， 以及value是否包含t
            if (hashMap.get(s.charAt(i)) == null) {
                if (hashMap.containsValue(t.charAt(i))) return false;
                hashMap.put(s.charAt(i), t.charAt(i));
            } else {  // 包含key 判断value师傅相等
                if (hashMap.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return true;
    }
}
