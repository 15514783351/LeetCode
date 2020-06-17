
// 路径总和
public class LeetCode0112 {

//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) return false;
//        if (root.left == null && root.right == null) return sum == root.val;
//
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }

    private int tar = 0;
    private boolean res = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        tar = sum;
        helper(root, root.val);
        return res;

    }

    private void helper(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == tar) res = true;
        } else {
            if (root.left != null) helper(root.left, sum + root.left.val);
            if (root.right != null) helper(root.right, sum + root.right.val);
        }
    }

}
