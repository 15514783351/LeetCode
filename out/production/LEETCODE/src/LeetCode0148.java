/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/12 16:07   戴宗明       1.0         None
 */


public class LeetCode0148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        head = dummy.next;

        for (int i = 1; i < length; i = i * 2) {
            ListNode prev = dummy;
            ListNode curr = prev.next;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = splitListNode(left, i);
                curr = splitListNode(right, i);
                prev.next = mergeListNode(left, right);

                if (prev.next != null) prev = prev.next;
            }
        }
        return dummy.next;

    }

    private ListNode splitListNode(ListNode head, int step) {
        if (head == null) return head;
        for (int i = 0; i < step - 1 && head.next != null; i++) {
            head = head.next;
        }

        ListNode right = head.next;
        head.next = null;
        return right;

    }

    private ListNode mergeListNode(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 != null) {
            head.next = l1;
        } else head.next = l2;

        return dummy.next;
    }
}
