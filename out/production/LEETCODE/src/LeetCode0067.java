/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/27 19:27   戴宗明       1.0         None
 */

// 二进制求和
public class LeetCode0067 {
    public String addBinary(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        StringBuilder sb = new StringBuilder();
        int add = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < (Math.max(length1, length2)); i++) {
            if (length1 - i > 0) {
                num1 = a.charAt(length1 - 1 - i) - '0';
            }
            if (length2 - i > 0) {
                num2 = b.charAt(length2 - 1 - i) - '0';
            }
            sb.append(String.valueOf((num1 + num2 + add) % 2));
            add = (num1 + num2 + add) / 2;
            num1 = 0;
            num2 = 0;
        }
//        if (length1 == length2 && !a.equals("0") && !b.equals("0")) sb.append("1");
        if (add == 1) sb.append("1");

        return sb.reverse().toString();

    }
}
