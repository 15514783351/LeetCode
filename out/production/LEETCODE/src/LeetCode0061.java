/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/6 11:22   戴宗明       1.0         None
 */

// 旋转链表
public class LeetCode0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        k = k % length;
        head = dummy.next;
        if (k == 0) return head;
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        // 首节点
        ListNode p = second.next;
        second.next = null;
        first.next = dummy.next;
        return p;

    }

}
