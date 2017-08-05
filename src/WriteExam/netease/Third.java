package WriteExam.netease;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(func1(start, end));
    }

    private static int func1(int start, int end) {
        HashSet<Integer>[] hashSets = new HashSet[end];
        for (int i = start; i < end; i++) {
            hashSets[i] = new HashSet<>();
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    hashSets[i].add(j);
                }
            }
        }
        int[] dp = new int[end+1];
        for (int i = start; i <= end ; i++) {
            for (int j = start; j < i; j++) {
                if (hashSets[j].contains(i - j)) {
                    if (dp[i] == 0) {
                        dp[i] = dp[j]+1;
                    }
                    else {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        int test = 1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == test) {
                System.out.println(i);
                test++;
            }

        }
        return dp[end];
    }
}
