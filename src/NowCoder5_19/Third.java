package NowCoder5_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/5/19.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][4];
        for (int i = 0; i < n; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }
        System.out.println(solution(array));
    }

    public static int solution(int[][] array) {
        if (array == null ||array.length ==0)
            return 0;
        int sum = Integer.MIN_VALUE;
        int who = 0;
        int sub = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i][2] = array[i][0] + array[i][1];
            array[i][3] = array[i][1] - array[i][0];
            if (array[i][2] >= sum && array[i][3] <= sub) {
                sum = array[i][2];
                who = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i != who && array[i][3] > 0) {
                sum += array[i][3];
            }
        }
        return sum;
    }
}
