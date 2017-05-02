package com.Abstract;

/**
 * Created by a on 2017/5/2.
 */
public class A_Test extends A_Basic {

    int i = 555;

    @Override
    public void print() {
        System.out.println("At that time is "+i);
    }

    public static void main(String[] args) {
        //abstract can't not be a class.
        // A_Basic a_basic = new A_Basic();
        A_Test a_test = new A_Test();
        a_test.print();
    }
    /*
    the result is that :
    At that time is 0
    At that time is 555

    WHY???
    因为继承了抽象类并实现了抽象方法，所以声明导出类的时候也会调用已实现的方法。
    不过为什么数据是0？？
    */

}
