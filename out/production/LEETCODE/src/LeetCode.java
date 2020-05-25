import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {

//        char[][] heights = {
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        };
//        int[] h = {3, 1, 3, 2, 2};
//        System.out.println(leetCode0085.maximalRectangle(heights));
//        System.out.println(leetCode0085.largestRectangleArea(h));
        ListNode l = new ListNode(4);
        ListNode p = l;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(3);
//        p = p.next;
//        p.next = new ListNode(6);
//        p = p.next;
//        p.next = new ListNode(7);
//        p = p.next;
//        p.next = new ListNode(2);
//        p = p.next;
//        p.next = new ListNode(1);
//        p = p.next;
//        p.next = new ListNode(4);
//        p = p.next;
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t2.left = new TreeNode(4);
        t1.right = t2;
        t1.left = t3;
//        LeetCode0094 leetCode0094 = new LeetCode0094();
//        System.out.println(leetCode0094.inorderTraversal(t1));

//        LeetCode0140 leetCode0140 = new LeetCode0140();


        int[] gas = {0, 0, 2, 3};
        int[] cost = {1, 1, 1, 1, 1};

        char[][] board = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', 'O', '0', '0'},
                {'1', '1', 'O', 'O', 'O'},
                {'0', '0', 'O', 'O', '0'}};
        LeetCode0066 leetCode0066 = new LeetCode0066();
        System.out.println(leetCode0066.plusOne(new int[]{1, 2, 3}));

    }

}
