import java.util.LinkedList;
import java.util.Queue;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/17 20:02   戴宗明       1.0         None
 */

//完全平方数
public class LeetCode0279 {
    public int numSqures(int n) {
        Queue<Integer> queue = new LinkedList<>();
        int size = 0;
        int headNum = 0;
        int step = 0;
        queue.offer(n);
        while (!queue.isEmpty()) {
            size = queue.size();
            step++;
            for (int i = 0; i < size; i++) {
                headNum = queue.poll();
                for (int j = (int)Math.sqrt(headNum); j > 0; j--) {
                    if (headNum == j * j) return step;
                    else {
                        queue.offer(headNum - j * j);
                    }
                }

            }

        }

        return 0;
    }
}
