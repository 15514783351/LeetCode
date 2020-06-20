/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/20 11:01   戴宗明       1.0         None
 */

// 两两交换链表中的节点
public class LeetCode0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        if (head == null || head.next == null) return head;
        return helper(head);
    }

    private ListNode helper(ListNode head) {

        // ListNode dummy = ListNode
        if (head != null && head.next != null) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = head;
            head.next = helper(head.next);
            return next;
        }
        return head;
    }
}
