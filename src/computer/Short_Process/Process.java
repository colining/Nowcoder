package computer.Short_Process;

/**
 * Created by asus on 2017/4/23.
 */
public class Process {


    String processName;     //进程名称

    int arrivalTime;        //到达时间
    int starTime;           //开始时间
    int finishTime;         //实际完成时间
    int wholeTime;          //运行所需要的的时间；
    int wholeTimeBack;      //运行时间备份；
    public String getProcessName() {
        return processName;
    }
    public int getStarTime() {
        return starTime;
    }

    public int getFinishTime() {
        return finishTime;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }
    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
    public void setStarTime(int starTime) {
        this.starTime = starTime;
    }
    public int getWholeTime() {
        return wholeTime;
    }
    public void setWholeTime(int wholeTime) {
        this.wholeTime = wholeTime;
    }
    public int getWholeTimeBack() {
        return wholeTimeBack;
    }
    public Process(String processName, int arrivalTime, int wholeTime) {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.wholeTime = wholeTime;
        this.wholeTimeBack = wholeTime;
    }


}
