package com.dhcc.written_examination.A_April_May;

/**
 * synchronized 干扰信息 synchronized是多线程
 * 调用时运行到这个方法时,都要检查有没有其它线程B（或者C、 D等）正在用这个方法(或者该类的其他同步方法)，
 * 有的话要等正在使用synchronized方法的线程B（或者C 、D）运行完这个方法后再运行此线程A,没有的话,锁定调用者,然后直接运行。
 *
 * run方法不会开启线程，所以从上到下只有一个线程  输出sougohello
 * start方法开启线程 ，所以先输出hello 在输出sougo main方法是主线程
 */
public class April27 {

    public static synchronized void  main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                Sogou();
            }
        };
        t.run();
        //t.start();
        System.out.println("hello");
    }
    static synchronized void Sogou(){
        System.out.println("Sougo");
    }
//测试dsadf
}
