package com.dhcc.written_examination.A_June;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个线程肯定有abc三个输出 所以当c的个数比b的个数多的选项就是错误的
 */
public class June29_thread {
    private List names = new ArrayList();

    public synchronized void add(String name) {
        names.add(name);
    }
    public synchronized void printAll(){
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i)+"");
        }
    }

    public static void main(String[] args) {
        final June29_thread s1 = new June29_thread();
        for (int i = 0; i < 2; i++) {
            new Thread(""+i){
                public void run(){
                    s1.add("A");
                    s1.add("B");
                    s1.add("C");
                    System.out.println(getName());
                    s1.printAll();
                }
            }.start();
        }
    }
}
