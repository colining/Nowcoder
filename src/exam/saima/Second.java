package exam.saima;


import java.util.Scanner;

/**
 * Created by colin on 2017/8/18.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int [][] a = new int[n][2];
            for (int j = 0; j < a.length; j++) {
                a[j][0] = scanner.nextInt();
                a[j][1] = scanner.nextInt();
            }
            func(a);
        }
    }

    private static void func(int[][] a) {
        int[] map = new int[100001];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                map[a[i][j]]++;
                max = Math.max(max, a[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            if (map[i] != 0 && map[i - 1] == 0 && (i == max || map[i + 1] == 0)) {
                sum += 2;
            }
            if (map[i] % 2 != 0) {
                sum++;
            }
        }
        System.out.println(sum > 2 ? "NO" : "YES");
    }
}
