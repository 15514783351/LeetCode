import java.util.ArrayList;
import java.util.List;

public class LeetCode0094 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        backtrack(root, res);
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
