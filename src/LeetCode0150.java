import java.util.Arrays;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/13 19:21   戴宗明       1.0         None
 */


public class LeetCode0150 {
    // 用时过长
//    public int evalRPN(String[] tokens) {
//        while (tokens.length != 1) {
//            tokens = joinTokens(tokens);
//        }
//        return Integer.parseInt(tokens[0]);
//    }
//
//    private String[] joinTokens(String[] tokens) {
//        String[] operators = {"+", "-", "*", "/"};
//        List<String> operatorsList = Arrays.asList(operators);
//        int length = tokens.length;
//        if (length == 1) return tokens;
//        if (length >= 3) {
//            String[] res = new String[length - 2];
//            for (int i = 0; i < length - 2; i++) {
//                if (!operatorsList.contains(tokens[i]) && !operatorsList.contains(tokens[i + 1])
//                        && operatorsList.contains(tokens[i + 2])) {
//                    for (int j = 0; j < i; j++) res[j] = tokens[j];
//                    switch (tokens[i + 2]) {
//                        case "+":
//                            res[i] = String.valueOf(Integer.parseInt(tokens[i]) + Integer.parseInt(tokens[i + 1]));
//                            break;
//                        case "-":
//                            res[i] = String.valueOf(Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i + 1]));
//                            break;
//                        case "*":
//                            res[i] = String.valueOf(Integer.parseInt(tokens[i]) * Integer.parseInt(tokens[i + 1]));
//                            break;
//                        case "/":
//                            res[i] = String.valueOf(Integer.parseInt(tokens[i]) / Integer.parseInt(tokens[i + 1]));
//                            break;
//                    }
//                    for (int j = i + 1; j < length - 2; j++) res[j] = tokens[j + 2];
//                    return res;
//                }
//            }
//        }
//        return tokens;
//
//    }
    public int evalRPN(String[] tokens) {
        int[] nums = new int[tokens.length];
        int index = 0;
        for (String token: tokens) {
            switch (token) {
                case "+":
                    nums[index - 2] += nums[--index];
                    break;
                case "-":
                    nums[index - 2] -= nums[--index];
                    break;
                case "*":
                    nums[index - 2] *= nums[--index];
                    break;
                case "/":
                    nums[index - 2] /= nums[--index];
                    break;
                default:
                    nums[index] = Integer.parseInt(token);
                    index++;
                    break;
            }
        }
        return nums[0];
    }
}
