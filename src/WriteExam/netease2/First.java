package WriteExam.netease2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by colin on 2017/8/8.
 */

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int avg = scanner.nextInt();
            PriorityQueue<Soccer> priorityQueue = new PriorityQueue<Soccer>(n, new Comparator<Soccer>() {
                @Override
                public int compare(Soccer o1, Soccer o2) {
                    if (o1.b == o2.b) {
                        return 0;
                    }
                    return o1.b > o2.b ? 1 : -1;
                }
            });
            int total = n * avg;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Soccer Soccer = new Soccer(a, b);
                total -= a;
                priorityQueue.add(Soccer);
            }
            long result = 0;
            while (!priorityQueue.isEmpty() && total > 0) {
                Soccer Soccer = priorityQueue.remove();

                int temp = r - Soccer.a;
                if (total < temp) {
                    temp = total;
                }
                Soccer.a = r;
                total -= temp;
                result += temp * Soccer.b;
            }
            System.out.println(result);
        }
        scanner.close();
    }


    public static class Soccer {
        int a;
        long b;

        public Soccer(int a, long b) {
            this.a = a;
            this.b = b;
        }
    }
}


// class Main {
//
//    public static class Score {
//        int a;
//        int b;
//        int current;
//
//        public Score(int a, int b) {
//            this.a = a;
//            this.b = b;
//            this.current = a;
//        }
//    }
//
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        Scanner scanner = new Scanner(System.in);
//        PriorityQueue<Score> priorityQueue = null;
//        while (scanner.hasNextInt()) {
//
//            int n = scanner.nextInt();
//            int full = scanner.nextInt();
//            int avg = scanner.nextInt();
//            int total = n * avg;
//
//            priorityQueue = new PriorityQueue<Score>(n, new Comparator<Score>() {
//                @Override
//                public int compare(Score o1, Score o2) {
//                    if (o1.b == o2.b)
//                        return 0;
//                    else if (o1.b > o2.b)
//                        return 1;
//                    else
//                        return -1;
//                }
//            });
//
//            for (int i = 0; i < n; ++i) {
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                total -= a;
//                Score score = new Score(a, b);
//                priorityQueue.add(score);
//            }
//            long needTime = 0;
//            while (!priorityQueue.isEmpty() && total > 0) {
//                Score score = priorityQueue.remove();
//
//                int tmp = full - score.a;
//                if (total < tmp) {
//                    tmp = total;
//
//                }
//                score.current = full;
//                total -= tmp;
//                needTime += tmp * score.b;
//            }
//            System.out.println(needTime);
//
//        }
//
//        scanner.close();
//
//    }
//}