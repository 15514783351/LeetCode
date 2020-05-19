import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode0094 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //回溯方法
//        backtrack(root, res);

        // 使用栈的方法
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }


        return res;
    }

    private void backtrack(TreeNode root, List<Integer> res) {
        if (root != null) {
            backtrack(root.left, res);
            res.add(root.val);
            backtrack(root.right, res);
        }
    }


}
