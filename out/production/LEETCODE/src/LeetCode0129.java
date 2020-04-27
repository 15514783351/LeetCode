import java.util.ArrayList;
import java.util.List;

public class LeetCode0129 {
    List<String> output = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
//        List<Integer> start = new ArrayList<>();
//        start.add(root.val);

        helper(root, "" + root.val);
//        System.out.println(output);
        int res = 0;
        for (String num: output) res += Integer.parseInt(num);
        return res;
    }

    private void helper(TreeNode root, String combination) {
        if (root.left == null && root.right == null) output.add(combination);
        else {
            if (root.left != null) {
                combination = combination + "" + root.left.val;
                helper(root.left, combination);
                combination = combination.substring(0, combination.length() - 1);
            }
            if (root.right != null) {
                combination = combination + "" + root.right.val;
                helper(root.right, combination);
                combination = combination.substring(0, combination.length() - 1);
            }
        }
    }
}
