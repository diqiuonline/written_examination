package com.dhcc.written_examination.A_April_May;

/**
 * User: 李锦卓
 * Time: 2019/4/21 23:57
 * 3423 f(0)没有异常，结果是34，然后f(1)出现异常执行catch,finally 外面的代码不会执行，所以结婚是3423
 */
public class April22 {
    public static String output = "";

    public static void foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            output += "2";
           // return;
        } finally {
            output += "3";
        }
        output += "4";
    }

    public static void main(String[] args) {
        foo(0);
        foo(1);
        System.out.println(output);
    }



}