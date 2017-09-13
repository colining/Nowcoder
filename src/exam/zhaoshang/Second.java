package exam.zhaoshang;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/13.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int[] array = new int[m];
            for (int i = 0; i < m; i++) {
                array[i] = scanner.nextInt();
            }
            func(array, array.length);
        }
    }

    private static void func(int[] array, int length) {
        if (array == null || array.length == 0) {
            System.out.println(false);
            return;
        }
        int start = 0;
        int end = array.length - 1;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int AScore = first(array, start, end);
        System.out.println(AScore > sum - AScore);
    }

    private static int first(int[] array, int start, int end) {
        if (start == end) {
            return array[end];
        } else if (start == end - 1) {
            return array[start] + array[end];
        }
        return Math.max(array[start] + second(array, start + 1, end), array[start] + array[start + 1] + second(array, start + 2, end));
    }

    private static int second(int[] array, int start, int end) {
        if (start >= end-1) {
            return 0;
        }
        return Math.min(first(array, start + 1, end), first(array, start + 2, end));
    }

}


