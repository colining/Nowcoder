package WriterandReader;

/**
 * Created by asus on 2017/3/28.
 */
public class Writer1 implements Runnable {
    int i ;
    File file;
    public Writer1(int i, File file) {
        this.i=i;
        this.file=file;
    }

    @Override
    public void run() {

    }
}
