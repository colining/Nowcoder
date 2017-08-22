package WriteExam.toutiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/22.
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

    static int sum = 0;
    private static void func1(int[] array) {
        Arrays.sort(array);
        boolean flag = false;
        int i = 0;
        while (i < array.length) {
            i += check(array, i);
        }
        System.out.println(sum);
    }

    private static int check(int[] array, int i) {
        if (i > array.length - 3) {
            if (i == array.length - 1 || array[i+1] - array[i]>20) {
                sum += 2;
                return array.length;
            }
            sum += 1;
            return array.length;
        }
        if (array[i + 1] - array[i] <= 10) {
            if (array[i + 2] - array[i + 1] <= 10) {
                return 3;
            }
            sum += 1;
            return 2;
        } else if (array[i + 1] - array[i] <= 20) {
            sum += 1;
            return 2;
        }
        sum += 2;
        return 1;
    }

}
