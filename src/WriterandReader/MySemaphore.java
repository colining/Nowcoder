package WriterandReader;

/**
 * Created by asus on 2017/3/16.
 */
public  class MySemaphore {
    int value;                              //信号量内部记录值
    public MySemaphore(int v){
        this.value = v;
    }
    public synchronized void p(){           //加锁的，实现原子性，p操作等待
        value = value-1;                    //p操作对资源来说，少了一个锁
        if(value<0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void v(){           //v操作唤醒；
        value = value+1;
        if(value<=0){
            this.notifyAll();
        }
    }
}
