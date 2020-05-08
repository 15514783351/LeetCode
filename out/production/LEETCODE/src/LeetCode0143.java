public class LeetCode0143 {
    public void reorderList(ListNode head) {
//        if (head != null) {
//            ListNode node = head;
//            int count = 0;
//            while(node != null) {
//                node = node.next;
//                count++;
//                if (count % 2 == 1)
//                    insetList(head, count);
//
//            }
//        }
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        for (int i = 1; i < length; i = i + 2) insetList(head, i);
    }

    private ListNode insetList(ListNode head, int insertIndex) {

        ListNode last = head;
        ListNode preLast = head;  //倒数第二位
        while (last.next != null) {
            preLast = last;
            last = last.next;
        }

        last.next = preLast;
        preLast.next = null;

        ListNode pre = head;
        for (int i = 0; i < insertIndex - 1; i++) {
            pre = pre.next;
        }

        ListNode second = pre.next;
        pre.next = last;
        last.next = second;

        return head;
    }

}
