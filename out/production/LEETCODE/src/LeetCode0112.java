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
        if (root.left == null && root.right == null) return sum == root.val;
        tar = sum;
        helper(root, 0);
        return res;

    }

    private void helper(TreeNode root, int sum) {
        if (sum == tar) {
            if (root == null) res = true;
        } else if (sum < tar) {
            if (root != null) {
                helper(root.left, sum + root.val);
                helper(root.right, sum + root.val);
            }
        }
    }

}
