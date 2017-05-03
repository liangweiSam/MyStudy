package com.Interface;

/**
 * Created by a on 2017/5/3.
 */

public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using"+p.name());
        System.out.println(p.process(s));
    }
}
