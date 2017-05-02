package com.cast;

/**
 * Created by liangws on 2017/4/1.
 */

public class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian A = f;

        A.swim();
        A.walk();
        Amphibian.tune(f);
    }

    /**
     * 向上转型后调用已覆盖的方法
     * 会变成调用新类的方法。
     */
    public void walk() {
        System.out.println("Frog is walking");
    }

    /**
     * 向上转型后并不能用新类的方法
     */
    public void jump() {
        System.out.print("Frog is jumping");
    }
}
