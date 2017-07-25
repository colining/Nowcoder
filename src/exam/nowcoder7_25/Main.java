package exam.nowcoder7_25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by colin on 2017/7/25.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.func3(4));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            System.out.println(main.func3(a));
        }
    }

    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    ArrayList<Integer> arrayList = null;
    HashSet<Integer> set = null;
    int sum = 0;

    public int func3(int num) {
        if (num == 0) {
            return 0;
        }
        arrayList = new ArrayList<>();
        set = new HashSet<>();
        funcTest(arrayList, num);
        return sum;
    }

    public void funcTest(ArrayList arrayList, int num) {
        if (arrayList.size() == num) {
            sum++;
            sum = sum % 1000000007;
            ArrayList<Integer> arrayList1 = (ArrayList<Integer>) arrayList.clone();
            arrayLists.add(arrayList1);
            return;
        }
        if (check(set, arrayList.size()+1)) {
            arrayList.add(1);
            funcTest(arrayList, num);
            arrayList.remove(arrayList.size() - 1);
        }
        arrayList.add(0);
        set.add(arrayList.size());
        int a = arrayList.size();
        funcTest(arrayList, num);
        set.remove(a);
        arrayList.remove(arrayList.size() - 1);
    }


    private boolean check(HashSet<Integer> set, int length) {
        for (Integer integer : set) {
            if (length % integer == 0 && integer !=1 &&length !=0) {
                return false;
            }
        }
        return true;
    }
}
