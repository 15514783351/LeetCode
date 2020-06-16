import java.util.ArrayList;
import java.util.List;

// 二叉树的最大深度
public class LeetCode0104 {
    private int res = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        helper(root, 0);
        return res;
    }

    private void helper(TreeNode root, int depth) {
        if (root == null) {
            if (depth > res) res = depth;
        } else {
            helper(root.left, depth + 1);
            helper(root.right, depth + 1);
        }
    }
}
