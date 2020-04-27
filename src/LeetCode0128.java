import java.util.HashSet;
import java.util.Set;

public class LeetCode0128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        int longest = 0;
        for (int num: nums) {
            numSet.add(num);
        }

        for (int num: numSet) {
            int currentLength = 1;
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                while (numSet.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    currentLength = currentLength + 1;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}
