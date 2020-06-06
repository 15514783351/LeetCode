/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/6 10:38   戴宗明       1.0         None
 */

// 两数相加
public class LeetCode0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        int add = 0;
        int res = 0;
        while (l1 != null && l2 != null) {
            res = (l1.val + l2.val + add) % 10;
            add = (l1.val + l2.val + add) / 10;
            head.next = new ListNode(res);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null) {
            res = (l2.val + add) % 10;
            add = (l2.val + add) / 10;
            head.next = new ListNode(res);
            head = head.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            res = (l1.val + add) % 10;
            add = (l1.val + add) / 10;
            head.next = new ListNode(res);
            head = head.next;
            l1 = l1.next;
        }
        if (add == 1) head.next = new ListNode(1);
        return dummy.next;
    }
}
