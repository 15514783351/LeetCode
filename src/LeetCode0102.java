import java.util.ArrayList;
import java.util.List;

public class LeetCode0102 {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return output;
        backtrack(root, 0);
        return output;
    }

    private void backtrack(TreeNode p, int level) {
        if (output.size() == level) output.add(new ArrayList<Integer>());
        output.get(level).add(p.val);
        if (p.left != null) backtrack(p.left, level + 1);
        if (p.right != null) backtrack(p.right, level + 1);
    }
}
