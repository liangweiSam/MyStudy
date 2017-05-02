package com.Interface;

/**
 * Created by a on 2017/5/2.
 */
public class Wind implements Playable, Instrument {

    @Override
    public void play() {
        System.out.println(this+"is playing");
    }

    @Override
    public void adjust() {

        String a = "abcdefg";
        char c;
        char[] b = a.toCharArray();
        for(int i=0;i<b.length;i=i+2) {
            c = b[i];
            b[i] = b[i+1];
            b[i+1] = c;
        }
        a = b.toString();

    }
}
