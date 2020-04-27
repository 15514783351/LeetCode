public class LeetCode0124 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return res;
    }

    private int getMax(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        res = Math.max(res, root.val + right + left);
        return Math.max(left, right) + root.val;
    }

//    private int getMin(TreeNode root) {
//        if (root == null) return 0;
//        int left =
//    }
}
