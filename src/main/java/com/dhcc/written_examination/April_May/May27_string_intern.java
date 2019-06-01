package com.dhcc.written_examination.April_May;

/**
 *结果是true
 * jdk 7 版本以上intern 方法会从字符串常量池中查询当前字符串是否存在，若不存在就将当前字符串放入常量池中
 * 所以jdk6是false 7以上是true
 */
public class May27_string_intern {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }

}
