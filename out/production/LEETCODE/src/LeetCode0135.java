import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0135 {

    public int candy(int[] ratings) {
        int sum = 0;
        int m = ratings.length;
        if (m <= 1) return m;
        int[] ratingsLeft = new int[m];
        int[] ratingsRight = new int[m];
        Arrays.fill(ratingsLeft, 1);
        Arrays.fill(ratingsRight, 1);

        for (int i = 1; i < m; i++) {
            if (ratings[i] > ratings[i - 1]) ratingsLeft[i] = ratingsLeft[i - 1] + 1;
        }

        for (int i = m - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1]) ratingsLeft[i - 1] = ratingsLeft[i] + 1;
        }

        for (int i = 0; i < m; i++) {
            sum += Math.max(ratingsLeft[i], ratingsRight[i]);
        }
        return sum;
    }
}
