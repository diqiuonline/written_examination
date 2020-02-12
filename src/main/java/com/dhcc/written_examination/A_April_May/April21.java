package com.dhcc.written_examination.A_April_May;

/**
 * User: 李锦卓
 * Time: 2019/4/21 23:57
 * 这里仅仅需要注意的是在try{}语句中执行到return 0 会在临时栈中存储值为0的变量。
 * 接着回去执行finally里面的内容，这时执行finally中的return 1;方法，这时
 * 临时栈中的值就是变为 1，会覆盖原来临时栈中的值0.所以它的返回值为1。
 */
public class April21 {
    public static void main(String[] args) {
        System.out.println(getValue());
    }
    public static int getValue(){
        try {
            return 0;
        } finally {
            return 1;
        }
    }

  /*  public static void main(String[] args) {
        System.out.println(test());;
    }
    static int test()
    {
        int x = 1;
        try {
            x++;
            return x;
        } finally
        {
            ++x;
        }
    }*/
}