package test;

/**
 * Created by colin on 2017/8/31.
 */
public class Base1 {
    public Base1() {
        System.out.println("base1");
    }
}
class Base2  extends Base1{
    //父类没有带参数的构造函数
    public Base2(int i ) {
        System.out.println("base2");
    }
}
class Base3 extends Base2 {
    //父类有带参数的构造函数，必须super
    public Base3(int i) {
        super(i);
        System.out.println("base3");
    }
    public static void main(String[] args) {
        Base3 base3 = new Base3(2);
    }
}
