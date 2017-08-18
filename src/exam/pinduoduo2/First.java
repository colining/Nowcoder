package exam.pinduoduo2;

import com.company.Sort;

import java.util.*;

/**
 * Created by colin on 2017/8/1.
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        int i = 0;
        while (i < num) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(fun1(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int fun1(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] a1 = new int[3];
        int[] a2 = new int[2];
        int[] a3 = new int[3];

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a1[0]) {
                a1[0] = array[i];
            }
            if (array[i] < a2[1]) {
                a2[1] = array[i];
            }

            if (array[i] == 0) {
                flag = true;
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            Arrays.sort(a3);
        }
        int sum=1;
        for (int i = 0; i < 3; i++) {
            sum *= a1[i];
        }
        int sum2 = a2[0] * a2[1] * a1[2];
        if (sum == 0 && !flag) {
            return a3[0] * a3[1] * a3[2];
        }
        return Math.max(sum, sum2);
    }

}
