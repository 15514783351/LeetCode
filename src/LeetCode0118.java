import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        res.add(pre);
        for (int i = 2; i < numRows + 1; i++) {
            List<Integer> last = new ArrayList<>();
            last.add(1);
            for (int j = 1; j < i - 1; j++) {
                last.add(pre.get(j - 1) + pre.get(j));
            }
            last.add(1);
            res.add(last);
            pre = last;
        }

        return res;
    }
}
