package exam.nowcoder7_25;

/**
 * Created by colin on 2017/7/28.
 */
 class Base {
    public Base(String s) {
        System.out.println("b");
    }
}

public class Deriverd extends Base {

    public Deriverd(String s) {
        super(s);
        System.out.println("d");
    }

    public static void main(String[] args) {
        new Deriverd("c");
        Object o = new Object();
    }

}
