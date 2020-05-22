/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/22 19:43   戴宗明       1.0         None
 */


public class LeetCode0733 {
    private boolean[][] used;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        used = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, newColor, image[sr][sc]);


        return image;
    }

    private void dfs(int[][] image, int row, int column, int newColor, int startColor) {
        if (row >= 0 && row < image.length && column >= 0 && column < image[0].length && !used[row][column]) {
            if (image[row][column] == startColor) {
                image[row][column] = newColor;
                used[row][column] = true;
                dfs(image, row + 1, column, newColor, startColor);
                dfs(image, row - 1, column, newColor, startColor);
                dfs(image, row, column + 1, newColor, startColor);
                dfs(image, row, column - 1, newColor, startColor);
            }

        }
    }
}
