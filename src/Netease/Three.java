package Netease;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/25.
 */
public class Three {
    public  static  void  main(String []arg)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;
        int array []=new int[n];
        while (i<n)
        {
            array[i]=scanner.nextInt();
            i++;
        }
        solution(k,array);

    }
  static   public void  solution(int k ,int array[])
    {
        if (k==0)
        {
            for (int i = 0;i<array.length;i++)
                if (i==array.length-1)
                    System.out.print(array[i]);
            else
                System.out.print(array[i]+" ");
            return;
        }
        int a= array[0];
        for (int i = 0 ;i<array.length;i++)
        {
            if (i==array.length-1)
                array[i]+=a;
            else if (i<array.length-1)
            array[i]+=array[i+1];

            if (array[i]>=100)
                array[i]%=100;
        }
        solution(k-1,array);
    }
}
