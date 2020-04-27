import java.util.ArrayDeque;
import java.util.Deque;

public class practices {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("1");
        deque.add("1");
        System.out.println(String.join(".", deque));
    }
}
