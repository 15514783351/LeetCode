import java.util.ArrayList;
import java.util.List;

public class LeetCode0113 {
    List<List<Integer>> output = new ArrayList<>();
    int sum;
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        // 从根节点出发
//        if (root == null) return output;
//        this.sum = sum;
//        List<Integer> temp = new ArrayList<>();
//        temp.add(root.val);
//        backtrack(root, temp);
//        return output;
//    }
//
//    private void backtrack(TreeNode root, List<Integer> com) {
//        int total = com.stream().reduce(Integer::sum).orElse(0);
//        if (total == sum && root.left == null && root.right == null) {
//            output.add(new ArrayList<>(com));
//        } else {
//            if (root.left != null) {
//                com.add(root.left.val);
//                backtrack(root.left, com);
//                com.remove(com.size() - 1);
//            }
//            if (root.right != null) {
//                com.add(root.right.val);
//                backtrack(root.right, com);
//                com.remove(com.size() - 1);
//            }
//        }
//    }
    // 从非根节点出发  也并非末节点结束
    public List<List<Integer>> pathNum(TreeNode root, int sum) {
        this.sum = sum;
        if (root != null) {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            backtrack(root, temp);
            pathNum(root.left, sum);
            pathNum(root.right, sum);
        }
        return output;

    }

    private void backtrack(TreeNode root, List<Integer> com) {
        int total = com.stream().reduce(Integer::sum).orElse(0);
        if (total == sum) {
            output.add(new ArrayList<>(com));
        } else {
            if (root.left != null) {
                com.add(root.left.val);
                backtrack(root.left, com);
                com.remove(com.size() - 1);
            }
            if (root.right != null) {
                com.add(root.right.val);
                backtrack(root.right, com);
                com.remove(com.size() - 1);
            }
        }
    }
}
