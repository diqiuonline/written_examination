package com.dhcc.written_examination.A_June;

/**
 * new一个内部内 会调用构造器 子类调用父类的构造器 执行test方法 应为子类重写了test方法
 * 所以输出Sub.test()flag因为是父类的构造 所以值是1
 * 然后执行子类后早期 输出Sub.Sub()flag=5
 */
public class June28_inner_class {
    class Supper{
        int flag = 1;
        Supper(){
            test();
        }
        void test() {
            System.out.println("Supper.test() flag =" + flag);
        }
    }
    class Sub extends Supper{
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag="+flag);
        }
        void test(){
            System.out.println("Sub.test()flag="+flag);
        }
    }

    public static void main(String[] args) {
        new June28_inner_class().new Sub(5);
    }
}
