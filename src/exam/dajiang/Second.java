package exam.dajiang;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/14.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int[] array = new int[20];
            for (int j = 0; j < 20; j++) {
                array[j] = scanner.nextInt();
                String a = scanner.next();
            }
            func(array);
        }

    }

    private static void func(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                continue;
            }
        }
    }
}
