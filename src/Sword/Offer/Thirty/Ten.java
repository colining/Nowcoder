package Sword.Offer.Thirty;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by asus on 2017/3/29.
 */
public class Ten {
    public  static  void  main(String [] arg)
    {
            int [] n=null;
            int [] n1 ={4,5,1,6,2,7,3,8};
            int [] n2 = {8,5,3,2,1,5};
        ArrayList arrayList =new ArrayList();
       arrayList= (GetLeastNumbers_Solution1(n,4));
      arrayList=  GetLeastNumbers_Solution1(n1,10);
      arrayList=  GetLeastNumbers_Solution1(n2,4);
        System.out.println("allla");
    }
    static public ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k)
    {
        ArrayList arrayList= new ArrayList();
        if (input==null||k<=0||k>input.length||input.length<=0)
            return arrayList;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            treeSet.add(input[i]);
        }
        for (int i=0;i<k;i++)
        {
            arrayList.add(treeSet.pollFirst());
        }
        return  arrayList;
    }
    static public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList arrayList= new ArrayList();
        if (input==null||k<=0||k>input.length||input.length<=0)
                return arrayList;

        int left = 0;
        int right = input.length-1;
        int index =AdujustArray(input,left,right);
        while (index!=k-1)
        {
            if (index<k-1) {
                left = index + 1;
                index=AdujustArray(input,left,right);
            }
            else
            {
                right =index-1;
                index= AdujustArray(input,left,right);
            }

        }
        for (int i = 0 ; i<k;i++)
        {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
    public  static  int AdujustArray(int array[], int left , int right)
    {
        int i =left;
        int j= right;
        int x = array[left];
        while (i<j)
        {
            while (array[j]>=x&&i<j)
                j--;
            if (i<j) {
                array[i] = array[j];
                i++;
            }

            while (array[i]<x&&i<j)
                i++;
            if (i<j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i]=x;
        return i;
    }
}
