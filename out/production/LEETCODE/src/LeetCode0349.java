import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/8 19:43   戴宗明       1.0         None
 */

// 两个数组的交集
public class LeetCode0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (Integer num: nums1) {
            set1.add(num);
        }
        for (Integer num: nums2) {
            if (set1.contains(num) && !list.contains(num)) {
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
}
