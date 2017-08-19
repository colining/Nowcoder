package exam.lianjia;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/19.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            func1(array);
        }
    }

    private static void func1(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : array) {
            hashSet.add(i);
        }
        int[] helper = new int[hashSet.size()];
        int i = 0;
        for (Integer integer : hashSet) {
            helper[i++] = integer;
        }
        Arrays.sort(helper);
        System.out.println(helper.length);
        for (int j = 0; j < helper.length; j++) {
            System.out.print(helper[j]);
            if (j != helper.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
