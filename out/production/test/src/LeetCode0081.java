public class LeetCode0081 {
//    public boolean search(int[] nums, int target) {
//        int length = nums.length;
//        if (length == 0) {
//            return false;
//        }
//        int start = 0;
//        int end = length - 1;
//        int rotate = findRotateIndex(nums, start, end);
//        if (rotate == 0) {
//            if (target >= nums[start] && target <= nums[end]) {
//                return binarySearch(nums, start, end, target);
//            }
//        } else if (target >= nums[rotate] && target <= nums[rotate - 1]){
//            if (target >= nums[start]) {
//                return binarySearch(nums, start, rotate - 1, target);
//            } else return binarySearch(nums, rotate, end, target);
//        }
//        return false;
//    }

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid]) {
                start++;
                continue;
            }
            //前半部分有序
            if (nums[start] < nums[mid]) {
                //target在前半部分
                if (nums[mid] > target && nums[start] <= target) {
                    end = mid - 1;
                } else {  //否则，去后半部分找
                    start = mid + 1;
                }
            } else {
                //后半部分有序
                //target在后半部分
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {  //否则，去后半部分找
                    end = mid - 1;

                }
            }
        }
        //一直没找到，返回false
        return false;

    }

    public int findRotateIndex(int[] nums, int start, int end) {
        int mid = 0;
        if (nums[start] < nums[end]) {
            return 0;
        } else {
            while (end - start > 1) {
                mid = (start + end) / 2;
                if (nums[mid] == nums[start]) {
                    start++;
                } else if (nums[mid] == nums[end]) {
                    end--;
                } else if (nums[mid] > nums[end] ) {
                    start = mid;
                } else if (nums[mid] < nums[end]) {
                    end = mid;
                }
            }
        }
        return start + 1;
    }

    public boolean binarySearch(int[] nums, int start, int end, int target) {
        while(start < end - 1) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) { //左边搜索
                end = mid;
            } else start = mid;
        }

        return nums[start] == target || nums[end] == target;
    }
}
