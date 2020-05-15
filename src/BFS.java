import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/15 16:06   戴宗明       1.0         None
 */


public class BFS {
    public int bfs(Node root, Node target) {
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> used = new HashSet<Node>();
        int step = 0;

        queue.offer(root);
        used.add(root);
        //BFS
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (cur == target) return step;
                if (cur != null) {
                    for (Node next: cur.neighbors) {
                        if (!used.contains(next)) {
                            queue.offer(next);
                            used.add(next);
                        }

                    }
                }
                queue.poll();
            }
        }
        return -1;
    }
}
