package com.dhcc.written_examination.B_Feb;

/**
 * @author 李锦卓
 * @version 1.0
 * @date 2020/2/12 14:52
 * Java对于静态成员变量的初始化，分解为两步执行。
 * 1. 根据静态成员变量在代码中的先后次序进行声明并赋值为缺省值
 * 2. 在静态块内依次为变量进行赋值
 * 初始a=0,b=0 private 构造方法后a=1,b=1 然后继续b=0
 * 输出
 *
 */
public class Feb12_Static {
    public static void main(String[] args) {
        SingLeton singLeton = SingLeton.getInstance();
        System.out.println(SingLeton.a);
        System.out.println(SingLeton.b);
    }
}


class SingLeton{
    public static int a;
    private static SingLeton singLeton = new SingLeton();
    private SingLeton(){
        a++;
        b++;
    }
    public static int b = 0;

    public static SingLeton getInstance() {
        return singLeton;
    }
}
