import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/8 20:20   戴宗明       1.0         None
 */

// 跳水版
public class Interview1611 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[]{};
        if (shorter == longer) return new int[]{longer * k};
        List<Integer> list = new ArrayList<>();
        int len = shorter * k;
        while (len <= longer * k) {
            list.add(len);
            len += longer - shorter;
        }
        int count = 0;
        int[] res = new int[list.size()];
        for (Integer i: list) res[count++] = i;
        return res;
    }
}
