import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 杨辉三角
public class LeetCode0118 {
    private ArrayList[] res;
    private HashMap<List<Integer>, Integer> visited = new HashMap<>();
    public List<List<Integer>> generate(int numRows) {
//        if (numRows == 0) return new ArrayList<>();
//        List<Integer> pre = new ArrayList<>();
//        pre.add(1);
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(new ArrayList<>(pre));
//        for (int i = 1; i < numRows; i++) {
//            pre.clear();
//            pre.add(1);
//            for (int j = 0; j < i - 1; j++) {
//                pre.add(res.get(i - 1).get(j) + res.get(i - 1).get(j + 1));
//            }
//            pre.add(1);
//            res.add(new ArrayList<>(pre));
//        }
//        return res;

        res = new ArrayList[numRows];
        visited.put(Arrays.asList(0, 0), 1);
        for (int i = 0; i < numRows; i++) {
            res[i] = new ArrayList();
            for (int j = 0; j <= i; j++) {
                int val = helper(i, j);
                res[i].add(val);
                if (visited.get(Arrays.asList(i, j)) == null) visited.put(Arrays.asList(i, j), val);

            }
        }
        return Arrays.asList(res);
    }

    private int helper(int i, int j) {
        if (j == 0 || j == i) return 1;
        else if (visited.get(Arrays.asList(i, j)) != null) {
            return visited.get(Arrays.asList(i, j));
        } else {
            return helper(i - 1, j - 1) + helper(i - 1, j);
        }
    }
}
