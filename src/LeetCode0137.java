import java.util.HashMap;
import java.util.Map;

public class LeetCode0137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.get(num) == null) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        for (int num: map.keySet()) {
            if (map.get(num) == 1) return num;
        }
        return -1;
    }
}
