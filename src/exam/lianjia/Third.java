package exam.lianjia;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/19.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int h = scanner.nextInt();
            func(array,h);
        }
    }

    private static void func(int[] array,int h) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (h + 30 >= array[i]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
