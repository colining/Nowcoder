package exam.meittuan;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/31.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            int K = scanner.nextInt();
            func(array, K);
            func1(array, K);
        }
    }

    private static void func1(int[] array, int k) {
        int[] helper = new int[array.length];
        helper[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            helper[i] += array[i] + helper[i - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = helper.length-1; i >=0 && i >max; i--) {
            if (helper[i] % k == 0) {
                max = i+1;
                break;
            }
            for (int j = 0; j < i && i - j>max; j++) {
                if ((helper[i] - helper[j]) % k == 0) {
                    max = i - j;
                    break;
                }
            }
        }
        System.out.println(max == Integer.MIN_VALUE?0:max);
    }

    private static void func(int[] array, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int cur = 0;
            for (int j = i; j < array.length; j++) {
                cur += array[j];
                if (cur % k == 0) {
                    max = Math.max(max, j - i+1);
                }
            }
        }
        System.out.println(max);
    }

}
