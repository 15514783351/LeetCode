/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/6 10:22   戴宗明       1.0         None
 */

//合并两个有序链表
public class LeetCode0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode(-1);
//        ListNode dummy = head;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                head.next = l1;
//                head = head.next;
//                l1 = l1.next;
//            } else {
//                head.next = l2;
//                head = head.next;
//                l2 = l2.next;
//            }
//        }
//
//        head.next = (l1 == null ? l2 : l1);
//        return dummy.next;
        return helper(l1, l2);

    }

    // 递归算法
    private ListNode helper(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val < l2.val) {
            l1.next = helper(l1.next, l2);
            return l1;
        } else {
            l2.next = helper(l1, l2.next);
            return l2;
        }
    }
}
