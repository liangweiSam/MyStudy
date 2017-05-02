package com.Interface;

/**
 * Created by a on 2017/5/2.
 */
public class Stringed implements Instrument,Playable {

    @Override
    public void play() {
        System.out.println(this+"is playing");
    }

    @Override
    public void adjust() {

    }
}
