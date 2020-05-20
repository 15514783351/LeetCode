import java.util.Stack;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/20 19:19   戴宗明       1.0         None
 */

// 用栈实现队列
public class LeetCode0232 {
    Stack<Integer> queue;
    /** Initialize your data structure here. */
    public LeetCode0232() {
        queue = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        queue.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!queue.isEmpty()) {
            temp.push(queue.pop());
        }
        int res = temp.pop();
        while (!temp.isEmpty()) {
            queue.push(temp.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!queue.isEmpty()) {
            temp.push(queue.pop());
        }
        int res = temp.peek();
        while (!temp.isEmpty()) {
            queue.push(temp.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
