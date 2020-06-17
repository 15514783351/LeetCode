/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/14 20:51   戴宗明       1.0         None
 */

// 第一个错误的版本
public class LeetCode0278 {
    public int firstBadVersion(int n) {
        int m = 0;
        int mid = 0;
        while (m < n) {
            mid = m + (n - m) / 2;
//            if (!isBadVersion(mid)) m = mid + 1;  // 这边这个函数 需要自己定义
//            else n = mid;
        }
        return n;
    }
}
