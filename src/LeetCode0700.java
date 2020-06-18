/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/18 20:29   戴宗明       1.0         None
 */

// 二叉搜索树中得搜索
public class LeetCode0700 {
    private TreeNode res;
    public TreeNode searchBST(TreeNode root, int val) {

        if (root != null) {
            if (root.val == val) res = root;
            searchBST(root.left, val);
            searchBST(root.right, val);
        }
        return res;

    }
}
