package exam.zhaoshang;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/13.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            func(a, b, n);
        }
    }

    private static void func(int a, int b, int n) {
        if (a == 0 || b == 0) {
            System.out.println(0);
            return;
        }
        int temp = 0;
        for (int i = Math.max(a,b); i <n ; i++) {
            if (i % a == 0 && i % b == 0) {
                temp = i;
                break;
            }
        }
        System.out.println(temp == 0 ? "0":n/temp);
    }
}
