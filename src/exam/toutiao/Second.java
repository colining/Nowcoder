package exam.toutiao;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/22.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        func(array);
    }

    private static void func(int[] array) {
        int[] helper1 = new int[array.length];
        helper1[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            helper1[1] = helper1[i - 1] + array[i];
        }
        int[] helper2 = new int[array.length];
        helper2[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            helper2[i] = Math.min(helper2[i - 1], array[i]);
        }

        int[] helper3 = new int[array.length];
        helper3[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i>=0 ; i--) {
            helper3[i] = Math.min(helper3[i + 1], array[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int cur = helper1[j] - (i>0?helper1[i-1]:0);
                int cur2 = Math.max(helper2[j], helper3[i]);
                max = Math.max(max, cur * cur2);
            }
        }
        System.out.println(max);
    }
}
