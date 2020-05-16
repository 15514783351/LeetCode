import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/16 9:44   戴宗明       1.0         None
 */

//打开转盘锁
public class OpenLock {
    public int openLock(String[] deadends, String target) {
        int step = 0;
        int length = target.length();
        List<String> deadendsList = Arrays.asList(deadends);
        Queue<String> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("0".repeat(length));
        queue.offer(String.valueOf(sb));
//        System.out.println(String.valueOf(sb));
        // 这边还需要一个 list 保存用过的
        List<String> used = new ArrayList<>();
        used.add("0000");
        if (deadendsList.contains(target)) return -1;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String num = queue.poll();
                for (int i = 0; i < length; i++) {
                    String str = num.substring(0, i) + String.valueOf((num.charAt(i) - '0' + 1) % 10) + num.substring(i + 1);
//                    if (str.equals(target)) return step;
                    if (!used.contains(str) && !deadendsList.contains(str)) {
                        used.add(str);
                        queue.offer(str);
                    }

                    str = num.substring(0, i) + String.valueOf((num.charAt(i) - '0' + 9) % 10) + num.substring(i + 1);
//                    if (str.equals(target)) return step;
                    if (!used.contains(str) && !deadendsList.contains(str)) {
                        used.add(str);
                        queue.offer(str);
                    }
                }
            }
        }
        if (queue.isEmpty()) System.out.println("yes");

        return step;
    }
}
