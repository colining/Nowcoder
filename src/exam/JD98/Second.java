package exam.JD98;

import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by colin on 2017/9/8.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            func(n);
        }
    }

    private static void func(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        if ((int)Math.pow(i, j) == (int)Math.pow(k, l)) {
                            sum++;
                        }
                    }
                }
            }

        }
        System.out.println(sum);
    }
}
