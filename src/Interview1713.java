import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/9 19:55   戴宗明       1.0         None
 */

// 恢复空格
public class Interview1713 {
    public int respace(String[] dictionary, String sentence) {
        Set<String> dicts = new HashSet<>(Arrays.asList(dictionary));
        int length = sentence.length();
        int[] dp = new int[length + 1]; // dp[i] 表示前i个字符有多少个未识别字符
        for (int i = 1; i < length + 1; i++) dp[i] = Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (dicts.contains(sentence.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j]);
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + i - j);
                }
            }
        }

        return dp[length];
    }
}
