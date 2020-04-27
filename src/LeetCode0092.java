public class LeetCode0092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next  =head;
        ListNode pre = dummy;
        int count = 0;
        while (count != m - 1) {
            pre = pre.next;
            count++;
        }
        ListNode first = pre.next;
        ListNode second = first.next;

        for (int i = 0; i < n - m; i++) {
            first.next = second.next;
            second.next = pre.next;
            pre.next  =second;
            second = first.next;
        }

        return dummy.next;
    }
}
