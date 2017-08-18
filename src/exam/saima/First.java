package exam.saima;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/18.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int[][] arr = new int[n][];
                for (int j = 0; j < n; j++) {
                    int num = scanner.nextInt();
                    arr[j] = new int[num];
                    for (int k = 0; k < num; k++) {
                        arr[j][k] = scanner.nextInt();
                    }
                }
                func2(n, x, y, arr);
            }

    }

    private static void func2(int n, int x, int y, int[][] arr) {
        int[] song = new int[1001];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                song[arr[i][j]]++;
                max = Math.max(max, arr[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i <=max; i++) {
            sum += song[i] / x;
            if (song[i] % x != 0) {
                sum++;
            }
        }
        boolean flag = sum <= y;
        System.out.println(flag ? "YES" : "NO");
    }

}
