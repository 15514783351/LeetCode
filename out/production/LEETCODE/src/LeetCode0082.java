public class LeetCode0082 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;
        int length = 0;
        while (dummy != null) {
            length++;
            dummy = dummy.next;
        }

        ListNode first;
        ListNode second;
        ListNode third;
        if (length < 2) return head;
        if (length == 2) {
            if (head.val == head.next.val) {
                return head.next.next;
            } else {
                return head;
            }
        }
        dummy = new ListNode(-1);
        dummy.next = head;

        first = dummy;
        second = first.next;
        third = second.next;
        first: for (int i = 0; i < length - 1; i++) {
            if (second.val == third.val) {
                for (int j = i + 2; j <= length; j++) {
                    third = third.next;
                    if (third == null) {
                        first.next = third;
                        break first;
                    } else if (second.val != third.val) {
                        first.next = third;
                        second = first.next;
                        third = second.next;
                        i = j - 1;
                        break;
                    }
                }
            } else {
                first = second;
                second = third;
                third = second.next;
            }
        }


        return dummy.next;
    }
}


