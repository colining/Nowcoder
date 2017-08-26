package exam.didi;

import java.util.*;

/**
 * Created by colin on 2017/8/26.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");
            int a = scanner.nextInt();
            int[] array = new int[strings.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.valueOf(strings[i]);
            }
//            System.out.println(func(array, a));
            System.out.println(func1(array, a));
        }
    }

    /*
    小根堆解法,可能有问题，因为测试用例看起来很少
     */
    private static int func1(int[] array, int a) {
        for (int i = (a-2)/ 2; i >= 0; i--) {
            AdjustMinHeap(array, i, a);
        }
        for (int i = a+1; i < array.length; i++) {
            if (array[i] > array[0]) {
                array[0] = array[i];
                AdjustMinHeap(array, 0, a );
            }
        }
        return array[0];
    }

    public static void AdjustMinHeap(int[] array, int k, int length) {
        int temp = array[k];
        for (int j = 2 * k + 1; j < length - 1; j = 2 * k + 1) {
            if (j < length && array[j] > array[j + 1]) {
                j++;
            }
            if (temp <= array[j])
                break;
            else {
                array[k] = array[j];
                k = j;
            }
        }
        array[k] = temp;

    }


    private static int func(int[] array, int a) {
        Arrays.sort(array);
        return array[array.length - a];
    }
}
