import java.util.*;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/22 14:58   戴宗明       1.0         None
 */


public class Test2 {
    public static void main(String[] args) {
        int[] deck = {1, 2, 3, 2, 3, 3};
        boolean b = hasGroupsSizeX(deck);
        System.out.println(b);
    }

    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;//如果未找到返回-1
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num: deck) {
            counter[num]++;
        }
        // 求gcd
        int x = 0;
        for(int cnt: counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 最大公约数
    public static int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
