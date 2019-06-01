package com.dhcc.written_examination.April_May;

/**
 *
 *枚举类型的本质是一个类
 * 枚举类型的构造器会在每一个枚举值初始化的时候运行一次，而且构造器必须是private
 * 枚举类型里面有三个实体类型，所以构造方法执行了三次，调用了AccountType.FIXED返回的是tostring
 * 在枚举类型中该方法重写了，返回的是name，所以是FIXED
 */
public class May26_enum {
    public static void main(String[] args) {
        System.out.println(AccountType.FIXED);
    }
    enum AccountType{
        SAVIGN,FIXED,CURRENT;
        private AccountType(){
            System.out.println("t is a account type");
        }
    }

}
