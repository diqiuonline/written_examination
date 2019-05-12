package com.dhcc.written_examination;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *2019
 * 2020
 * 2020
 * 2021
 * 2022
 * 创建对象，静态内部类的静态变量count诞生默认值2018
 * Count类型对象count对象调用getCount方法后静态变量count的值变为2019
 * Count类型的对象count调用count方法传入的值为2019的形参count，形参count的值为2020
 * 返回当前对象count调用getCount方法对变量++从2019变为2020
 * count对象调用getCount方法吧变量从2020编程2021
 * 新创建的count对象调用count方法 把变量从2021传入把局部变量变成2022
 */
public class May12_static_bilibili_Integer_volatile {
    public static void main(String[] args)  {
        Count count = new Count();
        count.count(count.getCount()).getCount();
        new Count().count(count.getCount());
        System.out.println(count.toString());
    }
    public static class Count{
        volatile Integer count = 2018;

        public Count count(Integer count) {
            System.out.println(++count);
            return this;
        }
        public Integer getCount(){
            System.out.println(++count);
            return count;
        }
        @Override
        public String toString() {
            return "Count{" +
                    "count=" + count +
                    '}';
        }
    }
}
