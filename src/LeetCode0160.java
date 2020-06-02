import java.util.HashSet;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/2 20:57   戴宗明       1.0         None
 */

// 相交链表
public class LeetCode0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        dummy1.next = headA;
        dummy2.next = headB;
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        headA = dummy1.next;
        headB = dummy2.next;
        return null;
    }
}
