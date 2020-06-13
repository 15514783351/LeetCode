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
        List<List<String>> out = new ArrayList<>();
        int length = strs.length;
        List<String> set = new ArrayList<>();
        for (String str: strs) {
            char[] arrChar = str.toCharArray();
            Arrays.sort(arrChar);
            String sortStr = new String(arrChar);
            if (!set.contains(sortStr)) set.add(sortStr);
        }
//        System.out.println(set.size());
        for (int i = 0; i < set.size(); i++) {
            List<String> temp = new ArrayList<>();
            for (String str: strs) {
                char[] arrChar = str.toCharArray();
                Arrays.sort(arrChar);
                String sortStr = new String(arrChar);
                if (set.get(i).equals(sortStr)) temp.add(str);
            }
            out.add(new ArrayList<>(temp));
        }

        return out;
    }
}
