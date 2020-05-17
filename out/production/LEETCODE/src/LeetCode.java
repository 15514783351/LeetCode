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


        int[] gas = {2, 2, 2, 3};
        int[] cost = {1, 2, 87, 87, 87, 2, 1};

        char[][] board = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', 'O', '0', '0'},
                {'1', '1', 'O', 'O', 'O'},
                {'0', '0', 'O', 'O', '0'}};
//        LeetCode0150 leetCode0150 = new LeetCode0150();
//        System.out.println(leetCode0150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

//        System.out.println((float)(2/ 3));
//        System.out.println("0" * 3);
        String[] deadends = {"1131","1303","3113","0132","1301","1303","2200","0232","0020","2223"};
        String target = "3312";

        LeetCode0279 leetCode0279 = new LeetCode0279();
        System.out.println(leetCode0279.numSqures(16));
    }

}
