import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/16 9:44   戴宗明       1.0         None
 */

//打开转盘锁
public class LeetCode0752 {
    //为何超出时间限制
//    public int openLock(String[] deadends, String target) {
//        int step = 0;
//        int length = target.length();
//        List<String> deadendsList = Arrays.asList(deadends);
//        Queue<String> queue = new LinkedList<>();
////        StringBuffer sb = new StringBuffer();
////        sb.append("0".repeat(length));
//        queue.offer("0000");
////        System.out.println(String.valueOf(sb));
//        // 这边还需要一个 list 保存用过的
//        List<String> used = new ArrayList<>();
//        used.add("0000");
//        if (deadendsList.contains("0000")) return -1;
//        if (deadendsList.contains(target)) return -1;
//        while (!queue.isEmpty()) {
//            step++;
//            int size = queue.size();
//            for (int j = 0; j < size; j++) {
//                String num = queue.poll();
//                for (int i = 0; i < length; i++) {
//                    for (int k = -1; k <= 1; k = k + 2) {
//                        String str = num.substring(0, i) + String.valueOf((num.charAt(i) - '0' + k + 10) % 10) + num.substring(i + 1);
//                        if (str.equals(target)) return step;
//                        if (!used.contains(str) && !deadendsList.contains(str)) {
//                            used.add(str);
//                            queue.offer(str);
//                        }
//                    }
////                    String str = num.substring(0, i) + String.valueOf((num.charAt(i) - '0' + 1) % 10) + num.substring(i + 1);
////                    if (str.equals(target)) return step;
////                    if (!used.contains(str) && !deadendsList.contains(str)) {
////                        used.add(str);
////                        queue.offer(str);
////                    }
////
////                    str = num.substring(0, i) + String.valueOf((num.charAt(i) - '0' + 9) % 10) + num.substring(i + 1);
////                    if (str.equals(target)) return step;
////                    if (!used.contains(str) && !deadendsList.contains(str)) {
////                        used.add(str);
////                        queue.offer(str);
////                    }
//                }
//            }
//        }
//
//
//        return -1;
//    }

    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet();
        for (String d: deadends) dead.add(d);

        Queue<String> queue = new LinkedList();
        queue.offer("0000");
        queue.offer(null);

        Set<String> seen = new HashSet();
        seen.add("0000");

        int depth = 0;
        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (node == null) {
                depth++;
                if (queue.peek() != null)
                    queue.offer(null);
            } else if (node.equals(target)) {
                return depth;
            } else if (!dead.contains(node)) {
                for (int i = 0; i < 4; ++i) {
                    for (int d = -1; d <= 1; d += 2) {
                        int y = ((node.charAt(i) - '0') + d + 10) % 10;
                        String nei = node.substring(0, i) + ("" + y) + node.substring(i+1);
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            queue.offer(nei);
                        }
                    }
                }
            }
        }
        return -1;
    }
}
