import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode0093 {
    List<String> output = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12 || s.length() < 4) return output;
        Deque<String> deque = new ArrayDeque<>();
        backtrack(s, s.length(), 0, 0, deque);
        return output;
    }

    private int judgeIsIp(String s, int left, int right) {
        int len = right - left + 1;

        if (len > 1 && s.charAt(left) == '0') return -1;
        int res = Integer.parseInt(s.substring(left, right + 1));
        if (res > 255) return -1;
        return res;
    }

    private void backtrack(String s, int len, int begin, int splitTimes, Deque<String> path) {
        if (begin == len && splitTimes == 4) {
            output.add(String.join(".", path));
        } else {
            for (int i = 0; i < 3; i++) {
                if (begin + i < len) {
                    int ipSegment = judgeIsIp(s, begin, begin + i);
                    if (ipSegment != -1) {
                        // 在判断是 ip 段的情况下，才去做截取
                        path.addLast(ipSegment + "");
                        backtrack(s, len, begin + i + 1,splitTimes + 1,  path);
                        path.removeLast();
                    }
                }
            }
        }
    }
}
