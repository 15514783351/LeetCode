import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/16 20:25   戴宗明       1.0         None
 */

// 判断二分图
public class LeetCode0785 {
    public boolean isBipartite(int[][] graph) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        LinkedList<Integer> queueA = new LinkedList<>();
        LinkedList<Integer> queueB = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].length != 0) {
                queueA.add(i);
                break;
            }
        }

        int sizeA = 0;
        int sizeB = 0;
        while (!queueA.isEmpty()) {
            sizeA = queueA.size();
            for (int i = 0; i < sizeA; i++) {   // 把queueA中的数字方法setA中
                int num = queueA.pollFirst();
                if (setB.contains(num)) return false;
                if (!setA.contains(num)) {
                    setA.add(num);
                    for (int j: graph[num]) { // 把setA中对应queue[i]中的数字放到setB中
                        queueB.addLast(j);
                    }
                }
            }
            sizeB = queueB.size();
            for (int i = 0; i < sizeB; i++) {   // 把queueB中的数字方法setB中
                int num = queueB.pollFirst();
                if (setA.contains(num)) return false;
                if (!setB.contains(num)) {
                    setB.add(num);
                    for (int j: graph[num]) { // 把setB中对应queue[i]中的数字放到setA中
                        queueA.addLast(j);
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{}};
        LeetCode0785 leetCode0785 = new LeetCode0785();
        System.out.println(leetCode0785.isBipartite(nums));
    }
}
