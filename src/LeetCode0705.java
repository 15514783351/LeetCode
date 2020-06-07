/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/7 19:36   戴宗明       1.0         None
 */

// 设计哈希集合
public class LeetCode0705 {
    class MyHashSet {
        boolean[] map = new boolean[1000005];
        /** Initialize your data structure here. */
        public MyHashSet() {

        }

        public void add(int key) {
            map[key] = true;
        }

        public void remove(int key) {
            map[key] = false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return map[key];
        }
    }
}
