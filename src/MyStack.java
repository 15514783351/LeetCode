import java.util.ArrayList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/17 21:22   戴宗明       1.0         None
 */


public class MyStack {
    private List<Integer> data;

    public MyStack() {
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public void push(int value) {
        data.add(value);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public boolean pop() {
        if (isEmpty()) {
            return false;
        } else {
            data.remove(data.size() - 1);
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
}
