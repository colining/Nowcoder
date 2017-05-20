package computer.WriterandReader1;


import computer.WriterandReader.MySemaphore;

/**
 * Created by asus on 2017/3/16.
 */
class Reader implements Runnable{
   volatile int count=0;                                          //读者数量
    MySemaphore rmutex;                                 //读信号量
    MySemaphore wmutex;                                 //写信号量

    public Reader(int c,MySemaphore r,MySemaphore w){   //构造函数
        this.count = c;
        this.rmutex = r;
        this.wmutex = w;
    }
    public void run(){
        while(true){
            rmutex.p();                                             //读者等待加锁
            if(count == 0) wmutex.p();                              //如果是首个读者，就抢夺写者锁么不允许写
            count++;
            rmutex.v();                                             //读者释放锁
            System.out.println(count+" begin read data");
            rmutex.p();                                             //读者加锁
            count--;                                                //当前读者完成
            System.out.println(count+" finish read data");
            if(count == 0) wmutex.v();                              //当前没有读者，写者锁释放，可以写啦
            rmutex.v();                                             //释放锁
//            try {
//                Thread.sleep((long) (Math.random()*1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class Writer implements Runnable{
    MySemaphore wmutex;
    public Writer(MySemaphore w){
        this.wmutex = w;
    }
    public void run(){
        while(true){
            wmutex.p();
            System.out.println("begin write data");
            System.out.println("finish write data");
            wmutex.v();
            try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ReaderWriter{
    public static void main(String[] args){
        int count = 0;
        MySemaphore rmutex = new MySemaphore(1);
        MySemaphore wmutex = new MySemaphore(1);
        Reader reader = new Reader(count,rmutex,wmutex);
        Writer writer = new Writer(wmutex);
        Thread r = new Thread(reader);
        Thread r1 = new Thread(reader);
        Thread w = new Thread(writer);
        Thread w1 = new Thread(writer);
        w1.start();
        r.start();
        w.start();
        r1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}  