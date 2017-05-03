package com.Interface;

/**
 * Created by a on 2017/5/3.
 */
public class otwProcessor {

    public static void main(String[] args) {
        o_t_w o = new o_t_w();
        Apply.process(new Adapter(o), "Iamthegod!!!");
    }
}
