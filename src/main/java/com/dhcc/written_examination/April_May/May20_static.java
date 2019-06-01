package com.dhcc.written_examination.April_May;

/**
 *输出c
 * 如果去掉final 输出abc
 * 因为final是一个常量 jvm直接将一个空间赋值为c
 * 调用的时候直接输出c
 *
 */
public class May20_static {

    public static void main(String[] args) {
        System.out.println(BX.c);
    }


}
class AX {
    static {
        System.out.println("A");
    }
}
class BX extends AX {
    static {
        System.out.println("B");
    }

    public final static String c = "C";
}