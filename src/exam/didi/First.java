package exam.didi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/26.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");
            int[] array = new int[strings.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.valueOf(strings[i]);
            }
            System.out.println(maxSum(array));
        }
    }
    public static int maxSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i != arr.length; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }
}
