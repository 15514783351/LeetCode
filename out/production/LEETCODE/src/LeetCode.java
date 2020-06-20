import java.util.Arrays;

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
        ListNode l = new ListNode(1);
        ListNode p = l;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);
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
        t1.left = t2;
//        t1.left = t3;



//        int[] gas = {1, 2, 3, 2};
//        int[] cost = {1, 1, 1, 1, 1};
//
//        char[][] board = {{'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', 'O', '0', '0'},
//                {'1', '1', 'O', 'O', 'O'},
//                {'0', '0', 'O', 'O', '0'}};
//        int[][] matrix = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//
//        LeetCode0049 leetCode0049 = new LeetCode0049();
//        String[] strs = {"eat", "ate", "ant"};
//        System.out.println(leetCode0049.groupAnagrams(strs));
        LeetCode0118 leetCode0118 = new LeetCode0118();
        System.out.println(leetCode0118.generate(5));

    }

}
