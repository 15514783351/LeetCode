public class LeetCode0149 {
//    public int maxPoints(int[][] points) {
//        int res = 0;
//
//    }

    public boolean isLine(int[] point, int a, int b) {
        //一次函数方程
        return point[0] * a + b == point[1];
    }

    public int[] getLine(int[] point1, int[] point2) {
        int[] wB = new int[2];
        wB[0] = (int)((point2[1] - point1[1]) / (point2[0] - point1[0]));
        wB[1] = point1[1] - wB[0] * point1[0];

        if (wB[0] * point2[0] + wB[1] != point2[1]) {
            wB[0] = 0;
            wB[1] = 0;
        }
        return wB;

    }
}
