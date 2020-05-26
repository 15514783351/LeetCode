import java.util.ArrayList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/26 19:35   戴宗明       1.0         None
 */

// 螺旋矩阵
public class LeetCode0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            res.add(matrix[0][i]);
            if (i == matrix[0].length - 1 && matrix.length >= 2) {
                matrix = rotateMatrix(matrix);
                i = -1;
            }
        }
        return res;
    }

    private int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[n][m - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                res[i][j] = matrix[j + 1][n - 1 - i];
            }
        }
        return res;
    }


}
