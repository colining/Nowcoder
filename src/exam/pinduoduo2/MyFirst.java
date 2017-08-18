package exam.pinduoduo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/10.
 */
public class MyFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long[] array = new long[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        func1(array);
    }

    private static void func1(long[] array) {
        Arrays.sort(array);
        int n = array.length - 1;
        long a = array[0] * array[1] * array[n];
        long b = array[n] * array[n - 1] * array[n - 2];
        System.out.println(Math.max(a, b));
    }
}
