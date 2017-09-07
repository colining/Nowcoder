package exam.nowcoder3;

import java.util.Scanner;

/**
 * Created by colin on 2017/5/19.
 */
public class First {
    //https://www.nowcoder.com/test/5217106/summary
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        int i = 0;
        while (i < num) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int num = 1;
        //flag 表示当前是递增还是递减；递增是true，递减是false
        boolean flag = false;
        //state 表示当前是否有趋势，比如 1,2,3,2,2,1；[3,2]显然破坏了之前的
        //趋势，但是新的趋势还未出现；需要后面的数才能得到；
        //没有趋势就是true，有趋势是false
        boolean state = true;
        for (int i = 0; i < array.length - 1; i++) {
            //当前没有趋势，需要重新改变趋势
            if (state && array[i] < array[i + 1]) {
                flag = true;
                state = false;
            } else if (state && array[i] > array[i + 1]) {
                flag = false;
                state = false;
            }
            //当前有明确趋势，递增，但此时被破坏了；
            //趋势不明，但是一定会是一个新的序列了
            if (!state && flag && array[i] > array[i + 1]) {
                state = true;
                num++;
            }
            //当前有明确趋势，递减，但被破坏了
            // //趋势不明，但是一定会是一个新的序列了
            else if (!state && !flag && array[i] < array[i + 1]) {
                state = true;
                num++;
            }

        }
        return num;
    }
}
