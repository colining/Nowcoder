package WriteExam.netease;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/5.
 */
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(func1(num));
    }

    private static int func1(int num) {
        int amount = (int) Math.pow(3, num);
        System.out.println(amount);
        if (num <= 2) {
            return amount;
        }
        int lightNum = (6 * (num - 3 + 1) * (int) Math.pow(3, num - 3));
        if (num == 3) {
            return amount - lightNum;
        }
        return amount - lightNum/2;
    }
}
