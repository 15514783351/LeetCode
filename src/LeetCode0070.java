import java.util.HashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/21 10:05   戴宗明       1.0         None
 */

// 爬楼梯
public class LeetCode0070 {
    HashMap<Integer, Integer> visited = new HashMap<>();
    public int climbStairs(int n) {
        // visited.put(0, 1);
        visited.put(1, 1);
        visited.put(2, 2);
        return helper(0, n);
    }

    private int helper(int i, int n) {
        if (i > n) {
            visited.put(i, 0);
            return 0;
        } else if (i == n) {
            visited.put(i, 1);
            return 1;
        } else if (visited.containsKey(i)) {
            return visited.get(i);
        } else {
            int res = helper(i + 1, n) + helper(i + 2, n);
            visited.put(i, res);
            return res;
        }
    }
}
