package com.Interface;

/**
 * Created by a on 2017/5/2.
 */
public class Music5  {

    static void tune(Playable p) {
        p.play();
    }

    static void tuneAll(Playable[] p) {
//        for(Playable i : p)
//            tune(i);
        String a = "abcdefg";
        char c;
        char[] b = a.toCharArray();
        for(int i=0;i<b.length-1;i=i+2) {
            c = b[i];
            b[i] = b[i+1];
            b[i+1] = c;
        }
        String d = new String(b);

        System.out.println(d);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
          new Wind(), new Stringed()
        };
        tuneAll(orchestra);
    }
}
