import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode0146 {
    static class LRUCache {
        private int capacity;
        private Map<Integer, Integer> map = new LinkedHashMap<>();
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if (map.keySet().contains(key)) {
                int value = map.get(key);
                map.remove(key);
                map.put(key, value);
                return value;
            } else return -1;
        }

        public void put(int key, int value) {
            if (map.keySet().contains(key)) {
                map.remove(key);
                map.put(key, value);
            } else if (map.size() == capacity) {
                Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
                Map.Entry<Integer, Integer> next = iterator.next();
                map.remove(next.getKey());
                map.put(key, value);
            } else map.put(key, value);
        }
    }
}
