public class LeetCode0080 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 2) return length;
        int count1 = 0;
        int count2 = 0;
        int lastNum = nums[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            if (nums[i] == lastNum) count1++;
        }
        for (int i = 0; i < length - 2; i++) {
            if (nums[i] == nums[length - 1]) break;
            if (nums[i] == nums[i + 2]) {
                for (int j = 0; j < length - i - 2 - 1; j++) {
                    nums[i + 2 + j] = nums[i + 2 + 1 + j];

                }
                i--;
            }

        }

        for (int i = length - 1; i >= 0; i--) {
            if (nums[i] == lastNum) count2++;
        }
        if (count1 >= 2) count1 = 2;
        return length - count2 + count1;
    }

//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for (int n : nums) {
//            if (i < 2 || n > nums[i-2]) nums[i++] = n;
//        }
//        return i;
//    }
}
