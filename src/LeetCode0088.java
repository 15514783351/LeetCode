public class LeetCode0088 {
    int[] nums1;
    int[] nums2;
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        int start = 0;
        for (int i = 0; i < m + n; i++) {
            for (int j = start; j < n; j++) {
                if (this.nums1[i] >= this.nums2[j]) {
                    for (int k = this.nums1.length - 1; k > i; k--) this.nums1[k] = this.nums1[k - 1];
                    this.nums1[i] = this.nums2[j];
                    start++;
                } else break;
            }
        }
        int end = n;
        if (start < n) {
            for (int i = m + n; i > 0; i--) {
                this.nums1[i - 1] = this.nums2[end - 1];
                end--;
                if (end == start) break;
            }
        }

    }
}
