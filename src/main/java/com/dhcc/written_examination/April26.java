package com.dhcc.written_examination;

/**
 * 答案是4
 * 短位与 左边右边都会执行
 * 双位与  左边是true右边不会执行
 */
public class April26 {

    private static int j = 0;

    private static Boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);
    }
    public static void main(String[] args) {
        methodA(0);
        System.out.println(j);
    }



}