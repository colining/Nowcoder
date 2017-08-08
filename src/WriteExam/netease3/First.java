package WriteExam.netease3;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] energy = new int[n];
            for (int i = 0; i < n; i++) {
                energy[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            int d = scanner.nextInt();
            func1(n, energy, k, d);
        }
    }

    private static void func1(int num, int[] energy, int k, int d) {

    }
}
