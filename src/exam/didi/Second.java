package exam.didi;

import java.util.*;

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
            int k = scanner.nextInt();
            System.out.println(findKthLargest(array, k) == findKthLargest1(array, k));
        }
    }

    public static int findKthLargest1(int[] array, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(array[i]);
        }
        for (int i = k; i < array.length; i++) {
            if (priorityQueue.peek() < array[i]) {
                priorityQueue.poll();
                priorityQueue.add(array[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static int findKthLargest(int[] array,  int k) {
        int[] arr = buildSmallHeap(array, k);
        for (int i = k; i <array.length ; i++) {
            if (array[i] > arr[0]) {
                arr[0] = array[i];
                adjust(arr,0,k);
            }
        }
        System.out.println(arr[0]);
        return arr[0];
    }

    private static int[] buildSmallHeap(int[] array, int k) {
        for (int i = k /2-1 ; i >=0 ; i--) {
            adjust(array, i, k);
        }
        return Arrays.copyOf(array, k);
    }


    //length 是截止位置，不包含它
    public static void adjust(int[] array, int k, int length) {
        int temp = array[k];
        for (int i = 2 * k + 1; i < length; i = 2 * k + 1) {
            i = (i < length - 1 && array[i] > array[i + 1]) ? i + 1 : i;
            if (array[i] < temp) {
                array[k] = array[i];
                k = i;
                continue;
            }
            break;
        }
        array[k] = temp;
    }
}
