import java.util.ArrayList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/18 19:50   戴宗明       1.0         None
 */

// 验证二叉搜索树
public class LeetCode0098 {
    private List<Integer> out = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        for (int i = 0; i < out.size() - 1; i++) {
            if (out.get(i) > out.get(i + 1)) return false;
        }
        return true;
    }

    private void helper(TreeNode root) {
        if (root != null) {
            helper(root.left);
            out.add(root.val);
            helper(root.right);
        }
    }

}
