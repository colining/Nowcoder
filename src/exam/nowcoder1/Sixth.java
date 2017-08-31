package exam.nowcoder1;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int L2 = scanner.nextInt();
            func(N, L2);
        }
    }

    private static void func(int n, int L) {
        boolean flag = false;
        for (int i = L; i <= 100; i++) {
            if ((i & 1) == 1 && (n / (double) i) == (n / i)) {
                int mid = n / i;
                for (int j = mid - (i-1)/2; j <=mid + (i-1)/2; j++) {
                    System.out.print(j);
                    if (j != mid + (i - 1) / 2) {
                        System.out.print(" ");
                    }
                }
                return;
            } else if ((i & 1) == 0 && (n / (double) i % 0.5 == 0 && n / (double) i != n / i)) {
                int mid = (int) Math.floor(n / (double) i);
                for (int j = mid - i / 2 + 1; j <= mid + i / 2; j++) {
                    System.out.print(j);
                    if (j != mid + i / 2) {
                        System.out.print(" ");
                    }
                }
                return;
            }
        }
        System.out.println("No");
    }
}
