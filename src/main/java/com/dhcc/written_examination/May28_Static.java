package com.dhcc.written_examination;

/**
 * SSClass
 * SuperClass init!
 * 123
 *
 * 我们调用父类的静态方法的时候 是不需要初始化的
 * 所以先调用祖父类的静态方法，输出SSClass
 * 在调用父类的静态方法 输出SuperClass init
 * 在调用父类的方法 输出123
 * 构造方法不会执行 只有new对象的时候构造方法才会执行
 */
class SSClass{
    static {
        System.out.println("SSClass");
    }
}
class SuperClass extends SSClass {
    static {
        System.out.println("SuperClass init");
    }
    public static int value = 123;
    public SuperClass(){
        System.out.println("init SuperClass");
    }
}
class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }
    static int a;
    public SubClass(){
        System.out.println("init SubClass");
    }
}
public class May28_Static {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}
