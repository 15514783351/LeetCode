
// 打家劫舍3
public class LeetCode0337 {
    public int rob(TreeNode root) {

        return helper(root);
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int mon = root.val;

        if (root.left != null) {
           mon += (helper(root.left.left) + helper(root.left.right));
        }
        if (root.right != null) {
            mon += (helper(root.right.left) + helper(root.right.right));
        }

        return Math.max(mon, helper(root.right) + helper(root.left));

    }
}
