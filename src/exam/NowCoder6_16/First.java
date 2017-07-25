package exam.NowCoder6_16;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by colin on 2017/6/16.
 */
public class First {
    public static void main(String[] args) {
        funA();
    }

    private static void funA() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int height[] = new int[number];
        int i = 0;
        while (i < height.length) {
            height[i++] = scanner.nextInt();
        }
        //System.out.println(findHeightDifference(height));
        System.out.println(findHeightDifference2(height));
    }


    private static int findHeightDifference2(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int a = Max(height);

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                Swap(height, i, j);
                int aa = Max(height);
                if (aa < a) {
                    a = aa;
                    continue;
                }
                Swap(height, j, i);
            }
        }
        return a;
    }

    private static void Swap(int[] height, int i, int j) {
        int temp = height[i];
        height[i] = height[j];
        height[j] = temp;
        return;
    }


    private static int Max(int[] height) {
        int differ = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int dif = Math.abs(height[i + 1] - height[i]);
            if (dif == 0)
                continue;
            if (dif > differ) {
                differ = dif;
            }
        }
        int dif = Math.abs(height[height.length - 1] - height[0]);
        if (dif > differ)
            differ = dif;
        return differ;
    }

    private static int findHeightDifference(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        Arrays.sort(height);

        int i = 1;
        int difference = height[height.length - 1] - height[0];
        while (i < height.length) {
            int differ1 = Math.abs(height[i] - height[0]);
            int differ2 = Math.abs(height[height.length - 1] - height[i]);
            if (differ1 == 0 || differ2 == 0) {
                break;
            }
            int differ = differ1 > differ2 ? differ1 : differ2;
            if (difference > differ) {
                difference = differ;
            }
            i++;
        }
        return difference;
    }
}
