/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/6/8 19:21   戴宗明       1.0         None
 */

//设计哈希映射
public class LeetCode0706 {
    class MyHashMap{
        boolean[] set = new boolean[100005];
        int[] hashMap = new int[100005];

        public MyHashMap() {

        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            set[key] = true;
            hashMap[key] = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            if (!set[key]) return -1;
            return hashMap[key];
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            hashMap[key] = 0;
            set[key] = false;
        }
    }
}
