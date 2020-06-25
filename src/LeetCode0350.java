import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/25 19:38   戴宗明       1.0         None
 */

// 两个数组的交集2
public class LeetCode0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num: nums1) {
            if (hashMap.containsKey(num)) hashMap.put(num, hashMap.get(num) + 1);
            else hashMap.put(num, 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int num: nums2) {
            if (hashMap.get(num) != null && hashMap.get(num) > 0) {
                res.add(num);
                hashMap.put(num, hashMap.get(num) - 1);
            }
        }
        int[] out = new int[res.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = res.get(i);
        }

        return out;
    }
}
