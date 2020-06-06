import java.util.LinkedList;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/6 9:53   戴宗明       1.0         None
 */

// 回文链表
public class LeetCode0234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;
        LinkedList<ListNode> stack = new LinkedList<>();
        while (head != null) {
            stack.addLast(head);
            head = head.next;
        }

        if (stack.size() % 2 == 1) {
            while (stack.size() > 1) {
                if (stack.pollFirst().val != stack.pollLast().val) return false;
            }
        } else {
            while (!stack.isEmpty()) {
                if (stack.pollFirst().val != stack.pollLast().val) return false;
            }
        }
        return true;

    }
}
