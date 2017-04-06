package com.cast;

/**
 * Created by liangws on 2017/4/1.
 */
public class Amphibian {

    static void tune(Amphibian A) {
        A.walk();
        A.swim();

    }

    public void walk() {
        System.out.println("walking");
    }

    public void swim() {
        System.out.println("swimming");
    }


}
