package com.dhcc.written_examination.A_June;

/**
 * int的最大值是2的31次方减一 超过会成为负数
 * 根据for循环规则 i的最后一值是2的30次方 i等于31
 */
public class June24_for {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i >= 0; i = i + i, j++) {
            System.out.println(i + "," + j);
        }
    }

}
