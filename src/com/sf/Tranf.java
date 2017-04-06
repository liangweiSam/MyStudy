package com.sf;

/**
 * Created by liangws on 2017/4/1.
 */
public class Tranf {

    private static final Value val_1 = new Value(20);
    private final Value val_2 = new Value(13);
    private final int v_3 = 3;

    public static void main(String args[]) {
        Tranf t1 = new Tranf();
//      val_1 = new Value(22);ERROR, 并不能指向新对象。

        t1.val_1.i++; //对象内容可以改变。 静态的永留存.
        System.out.println("t1.val_1.i ="+t1.val_1.i+"       "+"t1.val_2.i ="+t1.val_2.i);
//      t1.v_3 = 4; //数值不能改变

        Tranf t2 = new Tranf();
        t2.val_1.i++;
        System.out.println("t2.val_1.i ="+t2.val_1.i+"       "+"t2.val_2.i ="+t2.val_2.i);

    }

}
