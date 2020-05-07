import java.util.HashMap;
import java.util.Map;

public class LeetCode0142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
//        ListNode slow = head;
//        ListNode fast  = head;
//
//        while(fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) return slow;
//        }
//
//        return null;
        Map<ListNode, Integer> hashMap = new HashMap<>();
        ListNode node = head;
        while (node != null) {
            if (hashMap.get(node) != null) return node;
            else if (hashMap.get(node) == null) hashMap.put(node, 1);
            node = node.next;
        }
        return null;
    }
}
