package WriteExam.netease3;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(func1(array));
    }

    private static int func1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = (double) sum / array.length;
        if (Math.floor(avg) != Math.ceil(avg)) {
            return -1;
        }
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(avg - array[i])%2 !=0) {
                return -1;
            }
            if (array[i] > avg) {
                res += (array[i] - avg) / 2;
            }
        }
        return res;
    }
}
