package exam.nowcoder7_25;

import java.util.Scanner;

/**
 * Created by colin on 2017/7/25.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            System.out.println(func2(str));
        }
    }

    public static int func2(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        int[] array = new int[26];
        for (char c : string.toCharArray()) {
            array[c - 'a']++;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                sum++;
            }
        }
        return sum;
    }
}
