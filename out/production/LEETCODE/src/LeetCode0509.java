import java.util.HashMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/21 9:55   戴宗明       1.0         None
 */

// 斐波那契数列
public class LeetCode0509 {
    private HashMap<Integer, Integer> visited = new HashMap<>();
    public int fib(int N) {
        visited.put(0, 0);
        visited.put(1, 1);
        return helper(N);
    }

    private int helper(int N) {
        if (visited.containsKey(N)) return visited.get(N);
        else {
            int result = helper(N - 1) + helper(N - 2);
            visited.put(N, result);
            return result;
        }
    }
}
