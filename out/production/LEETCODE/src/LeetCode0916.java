import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/13 20:58   戴宗明       1.0         None
 */

// 单词子集
public class LeetCode0916 {
    public List<String> wordSubsets(String[] A, String[] B) {
        HashMap<Character, Integer> hashMapB = getMap(B);
        List<String> res = new ArrayList<>();
        for (String s: A) {
            HashMap<Character, Integer> hashMapA = getMap(s);
            int count = 0;
            for (Character key: hashMapB.keySet()) {
                if (!hashMapA.containsKey(key)) {
                    break;
                } else {
                    if (hashMapB.get(key) > hashMapA.get(key)) {
                        break;
                    } else count++;
                }
                if (count == hashMapB.size()) res.add(s);
            }
        }
        return res;
    }

    private HashMap<Character, Integer> getMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c: s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        return hashMap;
    }

    private HashMap<Character, Integer> getMap(String[] strs) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (String str: strs) {
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            for (Character c: str.toCharArray()) {
                if (hashMap1.containsKey(c)) {
                    hashMap1.put(c, hashMap1.get(c) + 1);
                } else {
                    hashMap1.put(c, 1);
                }
            }
            for (Character c: hashMap1.keySet()) {
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap1.get(c));
                } else {
                    if (hashMap.get(c) < hashMap1.get(c)) {
                        hashMap.put(c, hashMap1.get(c));
                    }
                }
            }
        }
        return hashMap;
    }

}
