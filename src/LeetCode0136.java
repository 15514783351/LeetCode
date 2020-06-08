import java.util.HashMap;
import java.util.Map;

public class LeetCode0136 {
    public int singleNumber(int[] nums) {
//        int ans = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            ans = ans ^ nums[i];
//        }
//        return ans;

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num: nums) {
            if (map.get(num) != null) {
                map.put(num, 2);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer key: map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return -1;
    }
}
