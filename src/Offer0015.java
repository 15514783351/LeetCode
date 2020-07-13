/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/13 20:35   戴宗明       1.0         None
 */

// 二进制种1的个数
public class Offer0015 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;

        // int res = 0;
        // while(n != 0) {
        //     res += n & 1;
        //     n >>>= 1;
        // }
        // return res;
    }
}
