import java.util.Arrays;

public class LeetCode0084 {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (heights[j] < heights[i]) {
                    left = j;
                    break;
                }
            }
            for (int k = i; k < heights.length; k++) {
                if (heights[k] < heights[i]) {
                    right = k;
                    break;
                }
            }
            maxArea = Math.max(maxArea, (right - left - 1) * heights[i]);
        }
        return maxArea;
    }

    public int getArea(int[] heights) {
        int length = heights.length;
        int minHeight = heights[0];
        for (int i = 0; i < length; i++) {
            if (minHeight >= heights[i]) minHeight = heights[i];
        }
        return length * minHeight;

    }
}
