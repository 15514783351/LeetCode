import java.util.LinkedList;

// 字符串相加
public class LeetCode0415 {
    public String addStrings(String num1, String num2) {
        LinkedList<Character> stack1 = new LinkedList<>();
        LinkedList<Character> stack2 = new LinkedList<>();
        for (Character c: num1.toCharArray()) {
            stack1.addLast(c);
        }
        for (Character c: num2.toCharArray()) {
            stack2.addLast(c);
        }
        int add = 0;
        int num = 0;
        int n1 = 0, n2 = 0;
        StringBuilder sb = new StringBuilder("");
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            n1 = 0;
            n2 = 0;
            if (!stack1.isEmpty()) {
                n1 = stack1.pollLast() - '0';
            }
            if (!stack2.isEmpty()) {
                n2 = stack2.pollLast() - '0';
            }
            num = (n1 + n2 + add) % 10;
            sb.append(num);
            add = (n1 + n2 + add) / 10;
        }
        if (add == 1) sb.append(1);
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        LeetCode0415 leetCode0415 = new LeetCode0415();
        System.out.println(leetCode0415.addStrings("1", "9"));
    }
}
