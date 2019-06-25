package com.dhcc.written_examination.June;

/**  1 2
 * try中return会开辟空间将x存入零时栈 在执行finally 返回时返回的是零时栈中的数据 而++操作的是局部变量本身
 */
public class June26_try_finally {
    public static void main(String[] args) {
        System.err.println(new June26_try_finally().method1());
        System.err.println(new June26_try_finally().method2());
    }
    public int method1(){
        int x = 1;
        try {
            return x;
        }finally {
            ++x;
        }
    }
    public int method2(){
        int x = 1;
        try {
            return x;
        }finally {
            return ++x;
        }
    }
}
