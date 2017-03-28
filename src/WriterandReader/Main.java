package WriterandReader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/28.
 */
public class Main {
    public  static  void  main(String []arg) throws InterruptedException {
        File file = new File(false,false);
       ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i =1;i<5;i++) {
            executorService.execute(new Writer1(i,file));
            executorService.execute(new Reader1(i,file));
        }
        //Thread.sleep(5000);
        //executorService.shutdown();

    }

}
