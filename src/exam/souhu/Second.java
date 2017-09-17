package exam.souhu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by colin on 2017/9/17.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            func(array);
            func2(array);
        }
    }

    private static void func2(int[] array) {
        int n = array.length;
        int[][] helper = new int[n][n];
        for (int i = 0; i < n; i++) {
            helper[i][i] = 0;
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i+1; j < n ; j++) {
                if (array[i] == array[j]) {
                    helper[i][j] = helper[i + 1][j - 1];
                }else {
                    helper[i][j] = Math.min(helper[i + 1][j] + array[i], helper[i][j - 1] + array[j]);
                }
            }
        }
        System.out.println(helper[0][n - 1]);
    }

    private static void func(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int sum = 0;
        int count = array.length;
        while (i < j) {
            if (array[i] != array[j]) {
                if (array[i] < array[j]) {
                    sum += array[i] * 2;
                    i++;
                    count++;
                }
                else {
                    sum += array[j] * 2;
                    j--;
                    count++;
                }
            }else {
                sum += array[i] * 2;
                i++;
                j--;
            }
        }
//        System.out.println(count);
        System.out.println(((count&1) == 0?0 : array[i]) + sum);
    }
}
