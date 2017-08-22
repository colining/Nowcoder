package exam.toutiao;

import java.util.*;

/**
 * Created by colin on 2017/8/12.
 */
/*
    Scanner的while循环
    不要着急写，先弄懂过程，反正面试机会也不大
    long long long ！
 */
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long[][] point = new long[n][n];
            int k = n;
            for (int i = 0; i < n; i++) {
                point[i][0] = scanner.nextLong();
                point[i][1] = scanner.nextLong();
                for (int j = 0; j <i ; j++) {
                    if (point[i][0] > point[j][0] && point[i][1] > point[j][1]) {
                        point[j][0] = Integer.MAX_VALUE;
                        point[j][1] = Integer.MAX_VALUE;
                        k--;
                    }
                }
            }
            Arrays.sort(point, new Comparator<long[]>() {
                @Override
                public int compare(long[] o1, long[] o2) {
                    return o1[0] > o2[0] ? 1:-1;
                }
            });
            for (int i =0; i< k; i++) {
                System.out.println(point[i][0] + " " + point[i][1]);
            }
//            func(point);
        }
    }


    private static void func(long[][] point) {
        Arrays.sort(point, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return o1[0] > o2[0] ? 1:-1;
            }
        });
        long[][] result = new long[100][100];
        int k = 0;
        long max = Integer.MIN_VALUE;
        for (int i = point.length-1; i >=0 ; i--) {
            if (point[i][1] > max) {
                max = point[i][1];
                result[k][0] = point[i][0];
                result[k][1] = point[i][1];
                k++;
            }
        }
        for (int i = k-1 ; i >= 0; i--) {
            System.out.print(result[i][0] + " " + result[i][1]);
            if (i != 0) {
                System.out.println();
            }
        }
    }
}
