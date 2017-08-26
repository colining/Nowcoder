package exam.sanliling;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by colin on 2017/8/26.
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
            func1(array);
            func2(array);
        }
    }

    private static void func2(int[] array) {
        int[] helper = new int[array.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
            int a = Arrays.binarySearch(priorityQueue.toArray(), array[i]);
            helper[i] = i - a;
        }
        for (int i = 0; i < helper.length; i++) {
            System.out.print(helper[i]);
            if (i != helper.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static void func1(int[] array) {
        int[] helper = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    helper[i]++;
                }
            }
        }
        for (int i = 0; i < helper.length; i++) {
            System.out.print(helper[i]);
            if (i != helper.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static void func(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int[] helper = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int cur = stack.isEmpty() ? 0 : helper[stack.peek()];
            while (!stack.isEmpty() && array[i] < array[stack.peek()]) {
                stack.pop();
                sum++;
            }
            helper[i] = sum += stack.isEmpty() ? cur : helper[stack.peek()];
            stack.push(i);
        }
        for (int i = 0; i < helper.length; i++) {
            System.out.print(helper[i]);
            if (i != helper.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
