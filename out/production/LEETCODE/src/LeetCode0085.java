public class LeetCode0085 {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int[] heights = new int[n];
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int k = i; k >= 0; k--) {
                    if (matrix[k][j] == '1') {
                        count++;
                    } else if (matrix[k][j] == '0') {
                        break;
                    }
                }
                heights[j] = count;

            }
//            for (int item: heights) System.out.print(item);
//            System.out.println();
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int[] newHeights = new int[heights.length + 2];
        int right = newHeights.length;
        for (int i = 1; i < right - 1; i++) newHeights[i] = heights[i - 1];
        for (int i = 0; i < newHeights.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (newHeights[j] < newHeights[i]) {
                    left = j;
                    break;
                }
            }
            for (int k = i; k < newHeights.length; k++) {
                if (newHeights[k] < newHeights[i]) {
                    right = k;
                    break;
                }
            }
            maxArea = Math.max(maxArea, (right - left - 1) * newHeights[i]);
        }
        return maxArea;
    }
}
