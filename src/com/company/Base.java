package com.company;

 public  class Base
{
    private String baseName = "base";

    public A getA() {
        return a;
    }

    A a = new A("base");
    public Base()
    {
        callName();
    }

    public void callName()
    {
        System. out. println(baseName);
    }

    static class Sub extends Base
    {
        private String baseName = "sub";
        public A getA() {
            return a;
        }
        A a= new A("sub");
        public void callName()
        {
            System. out. println (baseName) ;
        }
        public  void  test()
        {

        }
    }
    public static void main(String[] args)
    {
        Base b = new Sub();
        System.out.println(b.a.a);
        System.out.println(b.getA().a);
        //System.out.println(b.baseName);
    }
}
class  A
{
    String a= "aaaa";
    static String b = "lalalla";
    static
    {
        System.out.println(b);
        String b="buyaoa";
    }
    public A(String b)
    {
        this.a=b;
    }
}

