package com.dhcc.written_examination.A_April_May;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 最后面的分号没有影响，编译不会报错
 * 类加载会先进性静态成员初始化，静态代码块也是静态成员
 * 初始化的顺序会按照定义的先后顺序进行初始化
 * 10先除以3等于3在加上5等于8
 */
public class May9_ProcessBuilder {
    public static void main(String[] args) throws IOException {
        //使用processBuilder来调用第三方应用程序
        ProcessBuilder processBuilder = new ProcessBuilder();
        //设置第三方应用程序命令
        processBuilder.command("ipconfig");
        //将标准输入流和错误流合并
        processBuilder.redirectErrorStream(true);
        //启动一个进程
        Process start = processBuilder.start();
        //通过标准输入流拿到正常和错误信息
        InputStream inputStream = start.getInputStream();
        //转换成字符流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "gbk");
        char[] b = new char[1024];
        int len ;
        while ((len = inputStreamReader.read(b)) != -1) {
            String s = new String(b, 0, len);
            System.out.println(s);
        }
        inputStream.close();
        inputStreamReader.close();


    }
}
