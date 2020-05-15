import java.util.ArrayList;
import java.util.List;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/5/14 20:47   戴宗明       1.0         None
 */


class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    int[] queue;
    private int size = 0;
    private int head = -1;
    private int tail = -1;
    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
//        int length = queue.length;
        if (isFull()) return false;
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % size;
        queue[tail] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) return -1;
        return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return tail == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail + 1) % size == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
