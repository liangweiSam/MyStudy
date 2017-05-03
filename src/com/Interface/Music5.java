package com.Interface;

/**
 * Created by a on 2017/5/2.
 */
public class Music5  {

    static void tune(Playable p) {
        p.play();
    }

    static void tuneAll(Playable[] p) {
        for(Playable i : p)
            tune(i);

    }

    public static void main(String[] args) {
        Playable[] orchestra = {
          new Wind(), new Stringed()
        };
        tuneAll(orchestra);
    }
}
