package com.dhcc.written_examination.April_May;

/**
 *
 *无论线程如何抢夺，在空格前面一定会输出四
 */
public class May22_thread {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(j);
                    }
                    System.out.print(" ");
                }
            });
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }

}
