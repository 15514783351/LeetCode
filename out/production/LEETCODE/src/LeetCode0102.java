import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 二叉树的层序遍历
public class LeetCode0102 {
//    List<List<Integer>> output = new ArrayList<>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if (root == null) return output;
//        backtrack(root, 0);
//        return output;
//    }
//
//    private void backtrack(TreeNode p, int level) {
//        if (output.size() == level) output.add(new ArrayList<Integer>());
//        output.get(level).add(p.val);
//        if (p.left != null) backtrack(p.left, level + 1);
//        if (p.right != null) backtrack(p.right, level + 1);
//    }

    // bfs
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out = new ArrayList<>();
        if (root == null) return out;
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.pollFirst();
                list.add(temp.val);
                if (temp.left != null) queue.addLast(temp.left);
                if (temp.right != null) queue.addLast(temp.right);
            }
            out.add(new ArrayList<>(list));
        }
        return out;
    }
}
