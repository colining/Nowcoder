package exam.nowcoder20;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/30.
 */
public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();
            func(N, M, K);
        }
    }

    private static void func(int n, int m, int k) {
        int p = (int) Math.ceil(m / 2.0);
//        (int)Math.pow(26, p)*(n);

    }
}
