public class LeetCode0147 {
//    public ListNode insertionSortList(ListNode head) {
//        int length = 0;
//        ListNode dummy = new ListNode(Integer.MIN_VALUE);
//        dummy.next = head;
//        while(head != null) {
//            length++;
//            head = head.next;
//        }
//        head = dummy.next;
//        for (int i = 0; i < length - 1; i++) {
//            ListNode node1 = head;
//            for (int k = 0; k < i; k++) {
//                node1 = node1.next;
//            }
//            int leftValue = node1.val;
//            for (int j = i + 1; j < length; j++) {
//                ListNode node2 = head;
//                for (int k = 0; k < j; k++) {
//                    node2 = node2.next;
//                }
//                int rightValue = node2.val;
//                if (rightValue < leftValue) {
//                    head = insetList(head, i, j);
//                    dummy.next = head;
//                    leftValue = rightValue;
//                }
//            }
//        }
////        for (int i = 0; i < )
////        ListNode node = insetList(head, 1, 4);
//        return dummy.next;
//    }
//
//    private ListNode insetList(ListNode head, int left, int right) {
//        ListNode dummy = new ListNode(Integer.MIN_VALUE);
//        dummy.next = head;
//        ListNode first = dummy;  //表示left的前面listNode
//        ListNode second = dummy; //表示right的前面listNode
//        for (int i = 0; i < left; i++) {
//            first = first.next;
//        }
//        for (int i = 0; i < right; i++) {
//            second = second.next;
//        }
//        ListNode third = second.next;
//        second.next = third.next;
//        third.next = first.next;
//        first.next = third;
//        return dummy.next;
//    }

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode pre = dummy;
        dummy.next = head;
        while (head != null && head.next != null) {
            if (head.val <= head.next.val) {
                head = head.next;
                continue;
            }

            pre = dummy;
            while (pre.next.val < head.next.val) {
                pre = pre.next;
            }

            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
        }
        return dummy.next;
    }
}
