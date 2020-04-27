import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeetCode0107 {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return output;
        backtrack(root, 0);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = output.size() - 1; i >= 0; i--) res.add(output.get(i));
        return res;
    }

    private void backtrack(TreeNode root, int level) {
        if (level == output.size()) output.add(new ArrayList<>());
        output.get(level).add(root.val);
        if (root.left != null) backtrack(root.left, level + 1);
        if (root.right != null) backtrack(root.right, level + 1);
    }
}
