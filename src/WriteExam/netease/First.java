package WriteExam.netease;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by colin on 2017/8/5.
 */
public class First {
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
        int i = 0;
        int j = array.length - 1;
        int sum = 0;
        while (i < j) {
            if (array[i] < array[j]) {
                i++;
                sum++;
                array[i] += array[i - 1];
            }
            if (array[j] < array[i]) {
                j--;
                sum++;
                array[j] += array[j + 1];
            }
            if (array[j] == array[i]) {
                i++;
                j--;
            }
        }
        return sum;
    }

}
