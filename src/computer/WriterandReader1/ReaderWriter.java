package computer.WriterandReader1;


import computer.WriterandReader.MySemaphore;

/**
 * Created by asus on 2017/3/16.
 */
class Reader implements Runnable{
   volatile int count=0;                                          //��������
    MySemaphore rmutex;                                 //���ź���
    MySemaphore wmutex;                                 //д�ź���

    public Reader(int c,MySemaphore r,MySemaphore w){   //���캯��
        this.count = c;
        this.rmutex = r;
        this.wmutex = w;
    }
    public void run(){
        while(true){
            rmutex.p();                                             //���ߵȴ�����
            if(count == 0) wmutex.p();                              //������׸����ߣ�������д����ô������д
            count++;
            rmutex.v();                                             //�����ͷ���
            System.out.println(count+" begin read data");
            rmutex.p();                                             //���߼���
            count--;                                                //��ǰ�������
            System.out.println(count+" finish read data");
            if(count == 0) wmutex.v();                              //��ǰû�ж��ߣ�д�����ͷţ�����д��
            rmutex.v();                                             //�ͷ���
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