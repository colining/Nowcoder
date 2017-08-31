package exam.nowcoder2;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String strings = new String();
            int[][] array = new int[x][2];
            for (int i = 0; i < x; i++) {
                strings = scanner.next();
                char[] chars = strings.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == '0') {
                        array[i][0]++;
                    } else
                        array[i][1]++;
                }
            }
            func(array, n, m);
        }
    }

    private static void func(int[][] array, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = n; j >= array[i][0]; j--) {
                for (int k = m; k >= array[i][1]; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - array[i][0]][k - array[i][1]] + 1);
                }
            }
        }
        System.out.println(dp[n][m]);
    }

}
