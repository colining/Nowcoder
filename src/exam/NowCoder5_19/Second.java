package exam.NowCoder5_19;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/5/19.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[3 * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(solution(array));
    }

    public static long solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        long num = 0;
        for (int i = 0; i < array.length / 3; i++) {
            num += array[array.length - 2 - 2 * i];
        }
        return num;
    }
}
