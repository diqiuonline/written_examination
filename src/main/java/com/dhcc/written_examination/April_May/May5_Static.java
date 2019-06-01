package com.dhcc.written_examination.April_May;

/**
 * 最后面的分号没有影响，编译不会报错
 * 类加载会先进性静态成员初始化，静态代码块也是静态成员
 * 初始化的顺序会按照定义的先后顺序进行初始化
 * 10先除以3等于3在加上5等于8
 */
public class May5_Static {
    static int x = 10;
    static {
        x /= 3;
    }
    public static void main(String[] args) {
        System.out.println("x=" + x);
    }
    static {
        x += 5;
    };
}
