import java.util.ArrayList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/18 10:49   戴宗明       1.0         None
 */


public class MinStack {
    private List<Integer> data;

    /** initialize your data structure here. */
    public MinStack() {
        this.data = new ArrayList<>();
    }

    public void push(int x) {
        data.add(x);
    }

    public void pop() {
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        int min = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            Integer integer = data.get(i);
            if (integer < min) min = integer;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
