package com.dhcc.written_examination;

/**
 *如果没有join方法 输出 1 2
 * 有join方法 输出2 1
 * 在A线程中调用了B线程的join()方法时，表示只有当B线程执行完毕时，A线程才能继续执行
 */
public class May17_thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2");

            }
        });
        t.start();
        t.join();
        System.out.println("1");
    }

}
