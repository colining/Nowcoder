package exam.nowcoder;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/25.
 */
public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int k = scanner.nextInt();
            func(A, A+B, k);
        }
    }

    private static void func(int a, int sum, int k) {
        if (a == 0) {
            System.out.println(0);
            return;
        }
        long mx = 0,rest ,use;
        for (int i = 1; i <=sum ; i++) {
            mx += k;
            if (mx < a) {
                continue;
            }
            rest = mx - a;
            use = ( sum- a) * (i / 2);
            use += a * ((i - 1) / 2);
            use *= 2;
            if(rest % 2 == 0 && rest <= use){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
