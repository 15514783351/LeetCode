import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode0144 {
    public List<Integer> output = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root != null) {
//            output.add(root.val);
//            preorderTraversal(root.left);
//            preorderTraversal(root.right);
//        }
//        return output;
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return output;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return output;
    }


}
