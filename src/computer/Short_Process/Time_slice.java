package computer.Short_Process;

import java.util.*;

/**
 * Created by asus on 2017/4/24.
 */
public class Time_slice {
    public static void main(String[] args) {
        LinkedList<Process> linkedList = new LinkedList<>();
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
            linkedList.add(process);
          //  System.out.println("----------------------------");
        }
        test(linkedList);
    }
    public static void test(LinkedList<Process> linkedList)
    {
        final  int slice = 5;                                   //时间片大小
        ArrayList<Process> arrayList = new ArrayList<>();       //存储结果的容器
        Queue<Process> queue = new LinkedList<>();              //进程队列
        int nowtime = 0 ;                                       //目前时间
        int numberOfProcess = linkedList.size();                //进程数目
        int numberOfPorcessback = numberOfProcess;
        Collections.sort(linkedList, new Comparator<Process>() {
            @Override
            public int compare(Process o1, Process o2) {
                return o1.getArrivalTime()<o2.getArrivalTime()?-1:1;
            }
        });

        while (numberOfProcess>0)
        {
            /*
            进程队列有可能为空，这时CPU空闲，我们从作业中提取一个；
             */
            if (queue==null||queue.size()==0)
            {
                queue.add(linkedList.peekFirst());
                linkedList.poll();
            }
            /*
            cpu空闲，时间就更改
             */
            if (nowtime<queue.peek().getArrivalTime()) {
                System.out.println("cpu"+nowtime+"~"+queue.peek().getArrivalTime()+"空闲");
                nowtime = queue.peek().getArrivalTime();
            }
            /*
            核心代码
             */
            while (queue.size()!=0)
            {
                boolean flag = false;                                   //进程是否做完的标志
                int currentwholetime = queue.peek().getWholeTime();     //当前所需要的运行时间
                queue.peek().setWholeTime(currentwholetime-slice);
                if (queue.peek().getWholeTime()<=0)                     //进程做完
                {
                    queue.peek().setWholeTime(0);                       //运行时间设置为0；
                    numberOfProcess--;                                  //进程数--；
                    nowtime+=currentwholetime;
                    queue.peek().setFinishTime(nowtime);
                    arrayList.add(queue.poll());
                }
                else                                            //进程没做完；
                {
                    flag = true;
                    nowtime+=slice;

                }

                while (linkedList.size()!=0&&linkedList.peek().getArrivalTime()<nowtime)
                {
                    queue.add(linkedList.pop());
                }
                /*
                这里有两种情形，一种是时间片用完的在先，一种是从作业到来的在先；
                 */
                if (flag)
                {
                    queue.add(queue.peek());
                    queue.poll();
                }
                while (linkedList.size()!=0&&linkedList.peek().getArrivalTime()==nowtime)
                {
                    queue.add(linkedList.pop());
                }
            }
        }
        double sumTurnaround_time=0;
        double sumTurnaround_time_withwight =0;
        for (int i = 0; i < arrayList.size(); i++) {
            Process process= arrayList.get(i);
            System.out.print(process.getProcessName()+"到达时间为"+process.getArrivalTime()+" ");
            System.out.print("结束时间为"+process.getFinishTime()+" ");
            System.out.print("周转时间为"+(process.getFinishTime()-process.getArrivalTime()+" "));
            double Turnaround_time=(double)(process.getFinishTime()-process.getArrivalTime());
            System.out.print("周转时间"+Turnaround_time+" ");
            sumTurnaround_time+=Turnaround_time;
            double Turnaround_time_withwight= ((double)(process.getFinishTime()-process.getArrivalTime()))/(double)process.getWholeTimeBack();
            System.out.println("带权周转时间为"+Turnaround_time_withwight+" ");
            sumTurnaround_time_withwight+=Turnaround_time_withwight;
            System.out.println();
        }
        System.out.println("--------------------------------");
        System.out.println("平均周转时间为"+sumTurnaround_time/numberOfPorcessback);
        System.out.println("平均带权周转时间为"+ sumTurnaround_time_withwight/numberOfPorcessback);
    }
}
