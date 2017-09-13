package exam.didi910;

import java.util.Scanner;

/**
 * Created by colin on 2017/9/10.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            getNumber(array);
        }
    }

    private static void getNumber(int[] array) {

        int start = 0;
        int m = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                m++;
                start = i + 1;
                continue;
            }

            for (int j = start; j < i; j++) {
                int xor = 0;
                for (int k = j; k <= i; k++)
                    xor ^= array[k];
                if (xor == 0) {
                    m++;
                    start = i + 1;
                    continue;
                }
            }
        }
        System.out.println(m);
    }
}
