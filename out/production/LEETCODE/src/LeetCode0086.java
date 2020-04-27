public class LeetCode0086 {
    public ListNode partition(ListNode head, int x) {
//        ListNode dummy = new ListNode(-100);
//        dummy.next = head;
//        int length = 0;
//        while (head != null) {
//            length++;
//            head = head.next;
//        }
//        head = dummy.next;

        ListNode big = new ListNode(0);
        ListNode bigHead = big;
        ListNode small = new ListNode(0);
        ListNode smallHead = small;

        while(head != null) {
            if (head.val >= x) {
                big.next  = head;
                big = big.next;
//                System.out.println(big.val);
            } else {
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        big.next  =null;
        return smallHead.next;
    }
}
