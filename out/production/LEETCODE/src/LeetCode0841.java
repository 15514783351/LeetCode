import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/23 19:43   戴宗明       1.0         None
 */

// 钥匙和房间
public class LeetCode0841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int length = rooms.size();
        LinkedList<List<Integer>> queue = new LinkedList<>();
        List<Integer> used = new ArrayList<>();
        used.add(0);
        queue.addLast(rooms.get(0));
        while (!queue.isEmpty()) {
            List<Integer> room = queue.pollFirst();
            for (Integer i: room) {
                if (!used.contains(i)) {
                    used.add(i);
                    queue.addLast(rooms.get(i));
                }
            }
        }

        return used.size() == rooms.size();
    }
}
