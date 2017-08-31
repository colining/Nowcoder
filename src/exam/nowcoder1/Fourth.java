package exam.nowcoder1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/24.
 */
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            func(array);
        }
    }

    private static void func(int[] array) {
        Arrays.sort(array);
        boolean flag = false;
        int result=0;
        for (int i = 1; i < array.length; i++) {
            if (flag == true&& array[i] - array[i - 1] == 2||array[i] - array[i - 1] > 2) {
                System.out.println("mistake");
                return;
            }
            if (!flag && array[i] - array[i - 1] == 2) {
                result = array[i] - 1;
                flag = true;
            }
        }
        if (flag) {
            System.out.println(result);
        }else{
            if (array[0] - 1 > 0) {
                System.out.println((array[0] - 1) + " " + (array[array.length - 1] + 1));
            }else {
                System.out.println(array[array.length-1]+1);
            }
        }
    }
}
