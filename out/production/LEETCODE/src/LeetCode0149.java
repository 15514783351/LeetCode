public class LeetCode0149 {
    public int maxPoints(int[][] points) {
        int res = 0;
        int m = points.length;
        if (m <= 2) return m;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int count = 0;
                if (points[i][0] == points[j][0]) {
                    for (int k = 0; k < m; k++) {
                         if (points[k][0] == points[j][0]) count++;
                    }
                    if (count > res) res = count;
                } else {
                    float[] wB = getLine(points[i], points[j]);
                    if (wB[0] != 0 || wB[1] != 0) {
                        for (int k = 0; k < m; k++) {
                            if (isLine(points[k], wB[0], wB[1])) count++;
                        }
                        if (count > res) res = count;
                    }
                }
            }
        }
        return res;
    }

    private boolean isLine(int[] point, float a, float b) {
        //一次函数方程
        return point[0] * a + b == point[1];
    }

    float[] getLine(int[] point1, int[] point2) {
        float[] wB = new float[2];
//        if (point1[0] == point2[0]) {
//            return wB;
//        }
        wB[0] = ((float)(point2[1] - point1[1]) / (float)(point2[0] - point1[0]));
        wB[1] = point1[1] - wB[0] * point1[0];

        if (wB[0] * point2[0] + wB[1] - point2[1] > 0.01) {
            wB[0] = 0;
            wB[1] = 0;
        }
        return wB;

    }
}
