package com.company;

/**
 * Created by asus on 2017/3/19.
 */
public class ClassB extends  ClassA {
         int i;
    int test = 1;
    Test test1 =new Test("b");
    public ClassB(int v) {
        super(2);
        System.out.println("lallallalala");
        i=2;

        System.out.println(this.i);
        //father();
    }

//    public  void father()
//    {
//        System.out.println(test);
//    }
    @Override
    public void init(int v) {
        //super.init(v);
        System.out.println("lllll");
    }


    public  static  void  main(String [] arg) {
        ClassB classB = new ClassB(6);
    }
}
