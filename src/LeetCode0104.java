import java.util.ArrayList;
import java.util.List;

public class LeetCode0104 {
    List<List<Integer>> output = new ArrayList<>();
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        backtrack(root, 0);
        return output.size();
    }

    private void backtrack(TreeNode root, int level) {
        if (output.size() == level) output.add(new ArrayList<>());
        output.get(level).add(root.val);
        if (root.left != null) backtrack(root.left, level + 1);
        if (root.right != null) backtrack(root.right, level + 1);
    }
}
