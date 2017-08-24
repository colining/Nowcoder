package exam.nowcoder;

import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            func(n);
        }
    }

    private static void func(int n) {
        int[] helper = new int[10];
        int a = (int) Math.log10(n);
        for (int i = 0; i <=a; i++) {
            int left = (int) (n / Math.pow(10, i + 1));
            int right = (int) (n % Math.pow(10, i));
            int temp = (int) (n / Math.pow(10, i));
            temp = temp % 10;
            helper[temp] += right + 1 +(left-1)*Math.pow(10,i)>0?(left-1)*Math.pow(10,i):0;;
            for (int j = 0; j < temp; j++) {
                helper[j] += left * Math.pow(10, i);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(helper[i]);
        }
    }
}
