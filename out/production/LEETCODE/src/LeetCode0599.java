import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/10 19:58   戴宗明       1.0         None
 */

// 两个列表的最小索引总和
public class LeetCode0599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            hashMap.put(list1[i], i);
        }
        int sumIndex = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (hashMap.get(list2[i]) != null) {
                if (hashMap.get(list2[i]) + i < sumIndex) {
                    sumIndex = hashMap.get(list2[i]) + i;
                    res.clear();
                    res.add(list2[i]);
                } else if (hashMap.get(list2[i]) + i == sumIndex) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
