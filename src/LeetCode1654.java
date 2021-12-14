import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2021/12/14 19:57   戴宗明       1.0         None
 */
// 到家的最少跳跃次数
public class LeetCode1654 {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> forbiddenSet = new HashSet<>(forbidden.length);
        for (int i = 0; i < forbidden.length; i++) {
            forbiddenSet.add(forbidden[i]);
        }
        Set<Integer> visit = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        //new int[]{当前位置,方向(1代表向右,-1代表向左),跳跃次数}
        queue.add(new int[]{0,1,0});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            if(poll[0] == x) {
                return poll[2];
            }

            if(visit.contains(poll[0])) {
                continue;
            }
            visit.add(poll[0]);
            // left jump
            if(poll[1] == 1 && poll[0] - b > 0 && !forbiddenSet.contains(poll[0] - b) ) {
                queue.offer(new int[]{poll[0] - b, -1, poll[2] + 1});
            }

            // right jump
            if (!forbiddenSet.contains(poll[0] + a) && poll[0] + a < 6000) {
                queue.offer(new int[]{poll[0] + a, 1, poll[2] + 1});
            }


        }
        return -1;



    }

    public static void main(String[] args) {
        LeetCode1654 leetCode1654 = new LeetCode1654();
        int[] arr = {162,118,178,152,167,100,40,74,199,186,26,73,200,127,30,124,193,84,184,36,103,149,153,9,54,154,133,95,45,198,79,157,64,122,59,71,48,177,82,35,14,176,16,108,111,6,168,31,134,164,136,72,98};
        System.out.println(leetCode1654.minimumJumps(arr, 29, 98, 80));

    }
}
