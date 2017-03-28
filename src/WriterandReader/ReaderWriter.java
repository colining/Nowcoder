package WriterandReader;




/**
 * Created by asus on 2017/3/16.
 */
class Reader implements Runnable{
    int count;
    MySemaphore rmutex;
    MySemaphore wmutex;

    public Reader(int c,MySemaphore r,MySemaphore w){
        this.count = c;
        this.rmutex = r;
        this.wmutex = w;
    }
    public void run(){
        while(true){
            rmutex.p();
            if(count == 0) wmutex.p();
            count++;
            rmutex.v();
            System.out.println(count+" begin read data");
            rmutex.p();
            count--;
            System.out.println(count+" finish read data");
            if(count == 0) wmutex.v();
            rmutex.v();
            try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r1.start();

    }
}  