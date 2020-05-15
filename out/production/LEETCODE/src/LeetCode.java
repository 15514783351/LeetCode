import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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


        int[] gas = {2, 2, 2, 3};
        int[] cost = {1, 2, 87, 87, 87, 2, 1};

        char[][] board = {{'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'O', 'X'}};
//        LeetCode0150 leetCode0150 = new LeetCode0150();
//        System.out.println(leetCode0150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

//        System.out.println((float)(2/ 3));
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
//        System.out.println(myCircularQueue.queue[2]);
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        myCircularQueue.deQueue();
        myCircularQueue.enQueue(4);
        System.out.println(myCircularQueue.Rear());
    }

}
