package exam.nowcoder1;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/23.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int minSize = scanner.nextInt();
            int maxSize = scanner.nextInt();
            int n = scanner.nextInt();
            int[] fish = new int[n];
            for (int i = 0; i < n; i++) {
                fish[i] = scanner.nextInt();
            }
            func(fish, minSize, maxSize);
        }
    }

    private static void func(int[] fish, int minSize, int maxSize) {
        int[] map = new int[maxSize + 1];
        for (int i = 0; i < fish.length; i++) {
            int k = 0;
            for (int j = (int) Math.ceil(fish[i] / 10.0); j <= (int) Math.floor(fish[i] / 2.0); j++) {
                map[j] = 1;
            }
            for (int j = fish[i]*2; j <=fish[i]*10 && j<=maxSize; j++) {
                map[j] = 1;
            }
        }
        int sum = 0;
        for (int i = minSize; i < maxSize+1 ; i++) {
            if (map[i] == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
