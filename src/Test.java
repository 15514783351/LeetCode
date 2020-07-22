import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2020/7/21 21:18   戴宗明       1.0         None
 */


public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        hashMap.put(2, 1);
//        hashMap.put(1, 0);
//        Set<Integer> integers = hashMap.keySet();
//        Object[] array = integers.toArray();
//        Arrays.sort(array);
//        System.out.println(array[0]);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                if (hashMap.containsKey(l)) {
                    hashMap.put(l, hashMap.get(l) + 1);
                } else {
                    hashMap.put(l, 1);
                }
            }
            Set<Integer> integers = hashMap.keySet();
            Object[] objects = integers.toArray();
            Arrays.sort(objects);
            long sum = 1;
            int count = 0;
            for (int i = objects.length - 1; i>= 0; i--) {
                if (hashMap.get(objects[i]) >= 2) {
                    hashMap.put((int)objects[i], hashMap.get(objects[i]) - 2);
                    sum *= (int)objects[i];
                    count++;
                    if (count == 2) {
                        System.out.println(sum);
                        return;
                    }
                    i = i + 1;
                }
            }
        }
    }
}
