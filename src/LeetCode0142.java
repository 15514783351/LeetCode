import java.util.HashMap;
import java.util.Map;

public class LeetCode0142 {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();

        while (head != null && head.next != null) {
            if (map.get(head) == null) {
                map.put(head, 1);
                head = head.next;
            } else return head;
        }
        return null;
    }
}
