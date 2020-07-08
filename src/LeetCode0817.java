import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/8 20:34   戴宗明       1.0         None
 */

// 链表组件
public class LeetCode0817 {
    public int numComponents(ListNode head, int[] G) {
        List<Integer> list = Arrays.stream(G).boxed().collect(Collectors.toList());

        int res = 0;
        boolean flag = false;
        while (head != null) {
            if (list.contains(head.val) && !flag) {
                res++;
                flag = true;
            } else if (!list.contains(head.val)) {
                flag = false;
            }
            head = head.next;
        }

        return res;
    }
}
