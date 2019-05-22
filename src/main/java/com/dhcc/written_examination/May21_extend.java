package com.dhcc.written_examination;

/**
 * User: 李锦卓
 * Time: 2019/5/22 0:01
 */

/**
 * 0  B
 * 父类引用指向子类对象 编译在做，运行在右
 */
class A{
    public int a = 0;
    public void fun(){
        System.out.println("A");
    }
}

public class May21_extend extends A {
    public int a = 1;
    public void fun(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        A classA = new May21_extend();
        System.out.println(classA.a);
        classA.fun();
    }

}