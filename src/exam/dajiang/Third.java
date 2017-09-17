package exam.dajiang;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/9/14.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set1.add(scanner.nextInt());
            }
            for (int i = 0; i < m; i++) {
                set2.add(scanner.nextInt());
            }
            func(set1, set2);
        }
    }

    private static void func(HashSet<Integer> set1 ,HashSet<Integer> set2) {
        long[] array = new long[set1.size()];
        int k = 0;
        for (Integer integer : set1) {
            array[k++] = integer;
        }
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] % array[j] == 0 || array[j] %array[i] == 0) {
                    if (set2.contains(array[i] + array[j])) {
                        sum++;
                        set2.remove(array[i] + array[j]);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
