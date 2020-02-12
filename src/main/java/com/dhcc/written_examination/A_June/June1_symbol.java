package com.dhcc.written_examination.A_June;

/**
 * 1.0   1
 *三目运算符有个前提，整个运算的过程中 数据类型必须是一致的，所以o1会向上升级 变为1.0
 */
public class June1_symbol {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2 ;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.println(o1);
        System.out.println(" ");
        System.out.println(o2);

    }

}
