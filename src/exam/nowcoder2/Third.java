package exam.nowcoder2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Third {
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
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k <array.length ; k++) {
                    if (check(array, i, j, k)) {
                        sum++;
                    }else {
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }

    private static boolean check(int[] array, int i, int j, int k) {
        if (array[i] + array[j] > array[k]) {
            return true;
        }
        return false;
    }
}
