import java.util.ArrayList;
import java.util.List;

public class LeetCode0109 {
    int[] nums;
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] nums = list.stream().mapToInt(Integer::valueOf).toArray();
        this.nums = nums;
        return helper(0, nums.length - 1);

    }

    private TreeNode helper(int left, int right) {
        if (left > right) return null;

        int p = (left + right) / 2;
        if ((left + right) % 2 == 1) p = p + 1;

        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);

        return root;
    }
}
