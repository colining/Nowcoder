package exam.Netease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asus on 2017/3/25.
 */
public class First {
    public  static  void  main(String [] arg)
    {
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int x[] = new int[a];
        int y[] = new int[a];
        int i=0,j=0;
        while (i<a)
        {
            x[i++]=scanner.nextInt();
        }

        while (j<a)
        {
            y[j++]=scanner.nextInt();
        }


        int gx = scanner.nextInt();
        int gy = scanner.nextInt();
        int wt = scanner.nextInt();
        int tt = scanner.nextInt();
        System.out.println(solution(x, y, gx, gy, wt, tt));
    }

   static public  int solution(int x[] ,int y [] , int gx,int gy,int walktime,int taxitime)
    {

        int all = Math.abs(gx*walktime)+Math.abs(gy*walktime);
        int  []time = new int[x.length];
        for ( int i = 0 ; i <x.length;i++)
        {
            int wt= Math.abs(x[i]*walktime) +Math.abs(y[i]*walktime);
            int tt = Math.abs(gx-x[i])*taxitime+Math.abs(gy-y[i])*taxitime;
            time[i]=wt+tt;
        }
        Arrays.sort(time);
        if (time[0]<all)
        return  time[0];
        return all;
    }
}
