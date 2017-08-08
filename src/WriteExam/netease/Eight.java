package WriteExam.netease;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/6.
 */
public class Eight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        func1(x1, x2, x3, x4);
    }

    private static void func1(int x1, int x2, int x3, int x4) {
        double A = (x1 + x3) / 2.0;
        double B = (x2 + x4) / 2.0;
        double C = (x4 - x2) / 2.0;
        if (A != (int) A || B != (int) B || C != (int) C || A < 0 || B < 0 || C < 0) {
            System.out.println("No");
        } else {
            System.out.println((int) A + " " + (int) B + " " + (int) C);
        }
    }
}
