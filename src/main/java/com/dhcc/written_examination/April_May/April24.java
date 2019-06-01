package com.dhcc.written_examination.April_May;

public class April24 {

    public static void main(String[] args) {
        int x = 1, y = 1;
        boolean b;
        //b = x++ < 0 && y++ < 0 || x++ < 0 || y++ < 0 && x++ < 0 && y++ < 0;
        boolean c = x++ < 0 && y++ < 0;   //false   2 1
        boolean d = x++ < 0 && y++ < 0 || x++ < 0 ;   //false    3 1
        boolean e = x++ < 0 && y++ < 0 || x++ < 0 || y++ < 0 ;   //false    3 2
        boolean f = x++ < 0 && y++ < 0 || x++ < 0 || y++ < 0 && x++ < 0 ;   //false    3 2
        boolean g =  x++ < 0 && y++ < 0 || x++ < 0 || y++ < 0 && x++ < 0 && y++ < 0;   //false    3 2
        System.out.println(x);
        System.out.println(y);
    }



}