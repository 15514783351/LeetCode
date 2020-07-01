/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/28 15:04   戴宗明       1.0         None
 */

// 数字范围按位与
public class LeetCode0201 {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0; // 记录0的个数
        while (m < n) {
            m >>= 1;
            n >>= 1;
            count++;
        }
        return m <<= count;
    }
}
