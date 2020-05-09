import java.util.ArrayList;
import java.util.List;

public class LeetCode0144 {
    public List<Integer> output = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            output.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return output;
    }


}
