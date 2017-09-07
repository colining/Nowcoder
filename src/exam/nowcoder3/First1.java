package exam.nowcoder3;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/4.
 */
public class First1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            func(n);
        }
    }

    private static void func(int n) {
        int i = 0;
        int cur = 1;
        while (n / 10 > 0) {
            while (n != 0) {
                cur *= (n % 10);
                n /= 10;
            }
            n = cur;
            cur = 1;
            i++;
        }
        System.out.println(i);
    }
}
