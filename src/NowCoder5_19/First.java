package NowCoder5_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/5/19.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        int i = 0;
        while (i < num) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int num = 1;
        boolean flag = false;
        boolean time = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (time && array[i] < array[i + 1]) {
                flag = true;
                time = false;
            } else if (time && array[i] > array[i + 1]) {
                flag = false;
                time = false;
            }

            if (!time && flag && array[i] > array[i + 1]) {
                flag = false;
                time = true;
                num++;
            } else if (!time && !flag && array[i] < array[i + 1]) {
                flag = true;
                time = true;
                num++;
            }

        }
        return num;
    }
}
