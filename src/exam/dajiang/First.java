package exam.dajiang;

import javax.xml.parsers.FactoryConfigurationError;
import java.util.Scanner;

/**
 * Created by colin on 2017/9/14.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] array = new int[n-1][3];
            for (int i = 0; i < n-1; i++) {
                array[i][0] = scanner.nextInt();
                array[i][1] = scanner.nextInt();
                array[i][2] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            System.out.println(func(array, m, 0));
            func1(array, m, 0);
        }
    }

    private static int func1(int[][] array, int m, int sum) {
        if (m == 1) {
            return array.length+1;
        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i])
//        }
        return 0;
    }

    private static int func(int[][] array, int m, int sum) {
        if (m == 1) {
            return array.length+1;
        }
        if (m > array.length + 1) {
            return 0;
        }
        int node1 = 0;
        int node2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == m && array[i][2] == -1) {
                node1 = array[i][0];
            }
            if (array[i][1] == m && array[i][2] == 1) {
                node2 = array[i][0];
                break;
            }

        }
        if (node1 == 0 && node2 == 0 && true) {
            return sum + 1;
        }

        if (node1 != 0) {
            return func(array, node1, sum+1);
        }
        if (node2 != 0) {
            return func(array, node2, sum+1);
        }
        return sum;
    }
}
