package NowCoder5_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by colin on 2017/5/19.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[3 * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(solution1(array));
    }

    public static int solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int num = 0;
        for (int i = 0; i < array.length / 3; i++) {
            num += array[array.length - 2 - 2 * i];
        }
        return num;
    }

    public static int solution1(int[] array) {
        int sum = 0;
        int n = array.length / 3;
        int last = array.length - 2 - 2 * (n-1);
        int start = 0;
        int end = array.length - 1;
        int index = AdjustArray(array, start, end);
        while (last <= array.length - 2) {
            while (index != last) {
                if (index > last) {
                    end = index - 1;
                    index = AdjustArray(array, start, end);
                } else {
                    start = index + 1;
                    index = AdjustArray(array, start, end);
                }
            }
            sum+=array[last];
            last+=2;
        }
        return sum;
    }

    public static int AdjustArray(int array[], int left, int right) {
        int left1 = left;
        int right1 = right;
        int key = array[left];
        while (left1 < right1) {
            while (array[right1] >= key && left1 < right1)
                right1--;
            if (left1 < right1) {
                array[left1] = array[right1];
                left1++;
            }

            while (array[left1] < key && left1 < right1)
                left1++;
            if (left1 < right1) {
                array[right1] = array[left1];
                right1--;
            }
        }
        array[left1] = key;
        return left1;
    }
}
