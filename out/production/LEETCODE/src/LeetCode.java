import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Father {
    int x = 1;
    void father () {
        System.out.println("father1");
    }
}

class Mather extends Father {
    int x = 2;
    void mather () {
        System.out.println("mather");
    }

}

class Son extends Mather {
    int x = 3;
    void son () {
        System.out.println(super.x);
        ;
    }
}

class Mainmm {
    public String fun(String s) {
        int length  = s.length();
        LinkedHashMap<Integer, Character> index = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') index.put(i, s.charAt(i));
            else sb.append(s.charAt(i));
        }
        System.out.println(sb);

        // 复原函数
        for (int key: index.keySet()) sb.insert(key, index.get(key));

        return sb.toString();
    }
}

public class LeetCode {
    public static void main(String[] args) {
        Mainmm mm = new Mainmm();
        System.out.println(mm.fun("SSSS123S"));


//        char[][] heights = {
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        };
//        int[] h = {3, 1, 3, 2, 2};
//        System.out.println(leetCode0085.maximalRectangle(heights));
//        System.out.println(leetCode0085.largestRectangleArea(h));
//        ListNode l = new ListNode(1);
//        ListNode p = l;
//        p.next = new ListNode(2);
//        p = p.next;
//        p.next = new ListNode(3);
//        p = p.next;
//        p.next = new ListNode(4);
//        p = p.next;
//        p.next = new ListNode(5);
//        p = p.next;
//        p.next = new ListNode(7);
//        p = p.next;
//        p.next = new ListNode(2);
//        p = p.next;
//        p.next = new ListNode(1);
//        p = p.next;
//        p.next = new ListNode(4);
//        p = p.next;
//        TreeNode t1 = new TreeNode(1);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        t1.left = t2;
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

    }

}
