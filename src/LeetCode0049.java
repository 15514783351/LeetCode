import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/13 10:59   戴宗明       1.0         None
 */

// 字母异位词分组
public class LeetCode0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str: strs) {
            char[] arrChar = str.toCharArray();
            Arrays.sort(arrChar);
            String sortStr = new String(arrChar);
            if (hashMap.get(sortStr) == null) {
                hashMap.put(sortStr, new ArrayList<>());
                hashMap.get(sortStr).add(str);
            } else {
                hashMap.get(sortStr).add(str);
            }
        }
        return new ArrayList<>(hashMap.values());
    }
}
