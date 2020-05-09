import java.util.ArrayList;
import java.util.List;

public class LeetCode0145 {
    List<Integer> output = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            output.add(root.val);
        }
        return output;
    }
}
