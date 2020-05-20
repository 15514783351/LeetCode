import java.util.LinkedList;
import java.util.Queue;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/20 19:41   戴宗明       1.0         None
 */

// 用队列实现栈
public class LeetCode0225 {
    Queue<Integer> stack;
    private int res;
    /** Initialize your data structure here. */
    public LeetCode0225() {
        stack = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
        res = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        while (stack.size() > 1) {
            res = stack.poll();
            temp.add(res);
        }
        int r = stack.poll();
        stack = temp;
        return r;

    }

    /** Get the top element. */
    public int top() {
        return res;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
