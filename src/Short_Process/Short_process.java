package Short_Process;

import com.company.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by asus on 2017/4/23.
 */
public class Short_process {
    public static void main(String[] args) {
        ArrayList<Process> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入有几个进程呢？");
        int numberofprocess = in.nextInt();

        for (int i = 0 ; i<numberofprocess;i++)
        {
            System.out.println("请输入进程"+(i+1)+"的进程名称");
            String name = in.next();
            System.out.println("请输入进程"+(i+1)+"的到达时间");
            int arrivalTime = in.nextInt();
            System.out.println("请输入进程"+(i+1)+"的运行所需时间");
            int wholeTime = in.nextInt();
            Process process = new Process(name,arrivalTime,wholeTime);
            arrayList.add(process);
            //System.out.println("----------------------------");
        }
        test(arrayList);
    }


    public static void test (ArrayList<Process> arrayList)
    {
        int nowtime =0;                     //当前时间
        int currentprocess=0;               //当前进程
        int remain = arrayList.size();      //剩余进程数
        int numofprocess =arrayList.size();
        ArrayList<Process> arrayList1 = new ArrayList<>();
        /*
        以到达时间给进程排序；
         */
        Collections.sort(arrayList, new Comparator<Process>() {
            @Override
            public int compare(Process o1, Process o2) {
                return o1.getArrivalTime()<o2.getArrivalTime()?-1:1;
            }
        });
        while (remain>0)
        {

            System.out.println(remain);
            int shortTestArrival = arrayList.get(0).getArrivalTime();
            if (nowtime<shortTestArrival)                               //当前时间没有进程排队
                nowtime = shortTestArrival;
            int i = 1;
            currentprocess = 0;
            /*
            寻找到达中的最短进程
             */
            while (arrayList.size()>i &&arrayList.get(i).getArrivalTime()<=nowtime)
            {
                /*

                 */
                if (arrayList.get(i).getWholeTime()<arrayList.get(currentprocess).getWholeTime())
                {
                    currentprocess = i;
                }
                if (arrayList.get(i).getWholeTime()==arrayList.get(currentprocess).getWholeTime())
                {
                   int a = (int) (Math.random()*1000);                      //模拟进程条件相同，cpu随便选取
                    if ((a&1)==0)
                    {
                        currentprocess =i;
                    }
                }
                i++;
            }
            //Process process = arrayList.get(currentprocess);
            int wholeTime = arrayList.get(currentprocess).getWholeTime();           //运行时间
            arrayList.get(currentprocess).setStarTime(nowtime);                     //设置实际开始时间
            nowtime+=wholeTime;                                                     //当前时间更新
            arrayList.get(currentprocess).setFinishTime(nowtime);                   //设置完成时间

            arrayList1.add(arrayList.get(currentprocess));                          //加入完成队列
            arrayList.remove(currentprocess);                                       //等待队列删除；
            remain--;                                                               //剩余进程--
        }
        double sumTurnaround_time=0;
        double sumTurnaround_time_withwight =0;
        for (int i = 0; i < arrayList1.size(); i++) {
            double Turnaround_time;
            double Turnaround_time_withwight;
            System.out.println("进程"+(i+1)+arrayList1.get(i).getProcessName()+"的开始时间为");
            System.out.println(arrayList1.get(i).getStarTime());
            System.out.println("进程"+(i+1)+"的完成时间为");
            System.out.println(arrayList1.get(i).getFinishTime());

            System.out.println("进程"+(i+1)+"周转时间为");
            Turnaround_time = arrayList1.get(i).getFinishTime() - arrayList1.get(i).getArrivalTime();
            sumTurnaround_time+=Turnaround_time;
            System.out.println(Turnaround_time);

            System.out.println("进程"+(i+1)+"带权周转时间为");
            Turnaround_time_withwight = Turnaround_time / (double) arrayList1.get(i).getWholeTime();
            sumTurnaround_time_withwight+=Turnaround_time_withwight;
            System.out.println(Turnaround_time_withwight);
            System.out.println("----------------------------------------------");
        }
        System.out.println("先后顺序为：");
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i).getProcessName()+" ");
        }
        System.out.println();
        System.out.println("这组进程的平均周转时间为");
        System.out.println(sumTurnaround_time / numofprocess);
        System.out.println("这组进程的平均带权周转时间为");
        System.out.println(sumTurnaround_time_withwight / numofprocess);
    }
}
