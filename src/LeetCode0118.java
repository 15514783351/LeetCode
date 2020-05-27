import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(pre));
        for (int i = 1; i < numRows; i++) {
            pre.clear();
            pre.add(1);
            for (int j = 0; j < i - 1; j++) {
                pre.add(res.get(i - 1).get(j) + res.get(i - 1).get(j + 1));
            }
            pre.add(1);
            res.add(new ArrayList<>(pre));
        }
        return res;
    }
}
