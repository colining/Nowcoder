package exam.meittuan;

import java.util.*;

/**
 * Created by colin on 2017/8/31.
 */
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
//            func(array);
            func2(array);
        }
    }

    private static void func2(int[] array) {
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println(sum >= array[array.length - 1] ? "Yes" : "No");
    }

    private static void func(int[] array) {
        Arrays.sort(array);
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            deque.add(array[i]);
        }
        int cur = 0;
        int k = deque.pollLast();
        while (cur < k && !deque.isEmpty()) {
            cur += deque.pollFirst();
        }
        if (cur == k ) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
