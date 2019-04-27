package com.dhcc.written_examination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: 李锦卓
 * Time: 2019/4/21 23:37
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class April {
    //
    @Test
    public void demo1(){
        System.out.println(getValue());
    }
    public static int getValue(){
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}