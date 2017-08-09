package WriteExam.netease4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/9.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] array = new int[2 * n];
                for (int j = 0; j < array.length; j++) {
                    array[j] = scanner.nextInt();
                }
                func1(array, k);
            }

        }
    }

    private static void func1(int[] array, int k) {
        int n = array.length / 2;
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int temp = i;
            for (int j = 1; j <=k  ; j++) {
                if (temp >= n) {
                    int a = temp % n;
                    temp = a * 2 + 1;
                }else {
                    temp = temp*2;
                }
            }
            arrayCopy[temp] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrayCopy[i]);
            if (i != array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
