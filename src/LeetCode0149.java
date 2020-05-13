public class LeetCode0149 {
    public int maxPoints(int[][] points) {
        int res = 0;
        int m = points.length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int count = 0;
                int[] wB = getLine(points[i], points[j]);
                if (wB[0] != 0 || wB[1] != 0) {
                    for (int k = 0; k < m; k++) {
                        if (isLine(points[k], wB[0], wB[1])) count++;
                    }
                    if (count > res) res = count;
                }
            }
        }
        return res;
    }

    private boolean isLine(int[] point, int a, int b) {
        //一次函数方程
        return point[0] * a + b == point[1];
    }

    int[] getLine(int[] point1, int[] point2) {
        int[] wB = new int[2];
        if (point1[0] == point2[0]) {
            return wB;
        }
        wB[0] = (int)((point2[1] - point1[1]) / (point2[0] - point1[0]));
        wB[1] = point1[1] - wB[0] * point1[0];

        if (wB[0] * point2[0] + wB[1] != point2[1]) {
            wB[0] = 0;
            wB[1] = 0;
        }
        return wB;

    }
}
