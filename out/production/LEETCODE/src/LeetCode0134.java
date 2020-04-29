public class LeetCode0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        int m = gas.length;
        int[] two_gas = new int[2 * m];
        int[] two_cost = new int[2 * m];
        for (int i = 0; i < 2 * m; i++) {
            two_gas[i] = gas[i % m];
            two_cost[i] = cost[i % m];
        }
        f: for (int i = 0; i < m; i++) {
            if (two_gas[i] < two_cost[i]) continue f;
            else {
                int presentOil = 0;
                for (int j = i; j < i + m; j++) {
                    presentOil += two_gas[j] - two_cost[j];
                    if (presentOil < 0) continue f;
                }
                return i;
            }
        }

        return res;
    }
}
