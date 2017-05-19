package NowCoder;

/**
 * Created by colin on 2017/5/19.
 */
public class Test1 {
    private String a;

    public Test1(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1("hello world");
        System.out.println(test1.toString());
        a(test1);
        System.out.println(test1.toString());
    }
    public static void   a(Test1 test1){
        System.out.println(test1.hashCode());
        test1 = null;
        //System.out.println(test1.hashCode());
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a='" + a + '\'' +
                '}';
    }
}
