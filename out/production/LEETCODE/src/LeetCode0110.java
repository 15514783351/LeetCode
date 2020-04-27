public class LeetCode0110 {
    private class ReturnNode {
        boolean isB;
        int depth;
        public ReturnNode(int depth, boolean isB) {
            this.isB = isB;
            this.depth = depth;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return isBSF(root).isB;
    }

    private ReturnNode isBSF(TreeNode root) {
        if (root == null) return new ReturnNode(0, true);

        ReturnNode left = isBSF(root.left);
        ReturnNode right = isBSF(root.right);

        if (!left.isB || !right.isB) return new ReturnNode(0, false);

        if (Math.abs(left.depth - right.depth) > 1) return new ReturnNode(0, false);

        return new ReturnNode(Math.max(left.depth, right.depth) + 1, true);
    }
}
