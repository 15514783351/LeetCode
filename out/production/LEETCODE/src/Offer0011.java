import java.util.Arrays;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/22 21:34   戴宗明       1.0         None
 */


public class Offer0011 {
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[0];
    }
}
