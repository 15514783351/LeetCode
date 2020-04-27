public class LeetCode0083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;
        int length = 0;
        while (dummy != null) {
            length++;
            dummy = dummy.next;
        }

        ListNode first;
        ListNode second;
        if (length < 2) return head;
        if (length == 2) {
            if (head.val == head.next.val) {
                return head.next;
            } else {
                return head;
            }
        }
        dummy = new ListNode(-1);
        dummy.next = head;

        first = dummy;
        second = first.next;
        first: for (int i = 0; i < length; i++) {
            if (first.val == second.val) {
                for (int j = i + 1; j <= length; j++) {
                    second = second.next;
                    if (second == null) {
                        first.next = second;
                        break first;
                    } else if (first.val != second.val) {
                        first.next = second;
                        second = first.next;
                        i = j - 1;
                        break;
                    }
                }
            } else {
                first = second;
                second = first.next;
            }
        }


        return dummy.next;
    }
}


