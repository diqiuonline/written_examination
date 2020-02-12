package com.dhcc.written_examination.A_April_May;

/**
 *i<0
 * 第一次循环 输出abdc  i++  等于1
 * 第二次循环 输出bdc i++ 等于2
 * 第三次循环 输出b
 */
public class May18_for_static {
    static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }

}
