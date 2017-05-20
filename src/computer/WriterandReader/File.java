package computer.WriterandReader;

/**
 * Created by asus on 2017/3/28.
 */
public class File {
    public void setWriting(boolean writing) {
        this.writing = writing;
    }

    public void setReading(boolean reading) {
        this.reading = reading;
    }

    public void setI(int i) {
        this.i = i;
    }

    boolean writing=false;
    boolean reading=false;
   int i=0;
    public File(boolean writing, boolean reading) {
        this.writing = writing;
        this.reading = reading;
    }
    public synchronized void  startReader()
    {

    }

}
