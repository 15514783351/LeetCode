import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/25 19:47   戴宗明       1.0         None
 */


public class LeetCode0498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[0];
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < m + n - 1; i++) {
            int row = 0;
            int column = i;
            for (int j = 0; j <= i; j++) {
                if (row >= 0 && row < m && column >= 0 && column < n) {
                    linkedList.addLast(matrix[row][column]);
                }
                row += 1;
                column -= 1;
            }
            if (i % 2 == 0) {
                while (!linkedList.isEmpty()) list.add(linkedList.pollLast());
            } else {
                while (!linkedList.isEmpty()) list.add(linkedList.pollFirst());
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
