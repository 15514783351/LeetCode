import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode0145 {
    List<Integer> output = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
//        if (root != null) {
//            postorderTraversal(root.left);
//            postorderTraversal(root.right);
//            output.add(root.val);
//        }
//        return output;
        if (root == null) return output;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            output.add(stack2.pop().val);
        }
        return output;
    }
}
