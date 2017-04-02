package Sword.Offer.Fifty;

import java.util.ArrayList;

/**
 * Created by asus on 2017/4/2.
 */
public class One {
    public  static  void  main(String []arg)
    {
        int a[] = {1,2,4,7,11,15};
        FindNumbersWithSum(a, 15);
        System.out.println("aaa");
    }
  static   public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
                int head = 0 ;
                int end = array.length-1;
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (array==null||array.length==0)
                return arrayList;
            while (head<end)
            {
                if (array[head]+array[end]>sum)
                    end--;
                else if (array[head]+array[end]<sum)
                    head++;
                if (array[head]+array[end]==sum)
                {
                    arrayList.add(array[head]);
                    arrayList.add(array[end]);
                    break;
                }
            }
            return arrayList;
    }
}
