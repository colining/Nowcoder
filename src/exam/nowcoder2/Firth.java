package exam.nowcoder2;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Firth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }
        func(array);
    }

    private static void func(int[][] array) {
        int maxH = array[0][1];
        int maxR = array[0][0];
        int minD = array[0][1];
        int minL = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][1] > maxH) {
                    maxH = array[i][1];
                }
                if (array[i][1] < minD) {
                    minD = array[i][1];
                }
                if (array[i][0]>maxR) {
                    maxR = array[i][0];
                }
                if (array[i][0] < minL) {
                    minL = array[i][0];
                }
            }
        }
        System.out.println((int) Math.abs(maxH-minD) * (int) Math.abs(maxR - minL));
    }
}
