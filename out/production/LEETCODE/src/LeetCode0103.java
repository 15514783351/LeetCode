

import javafx.css.converter.LadderConverter;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0103 {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return output;
        backtrack(root, 0);
        return output;
    }

    private void backtrack(TreeNode root, int level) {
        if (output.size() == level) output.add(new ArrayList<>());

        if (level % 2 == 0) output.get(level).add(root.val);
        if (level % 2 == 1) output.get(level).add(0, root.val);

        if (root.left != null) backtrack(root.left, level + 1);
        if (root.right != null) backtrack(root.right, level + 1);
    }
}
