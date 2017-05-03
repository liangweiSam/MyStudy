package com.Interface;

/**
 * Created by a on 2017/5/3.
 */
public class o_t_w  {

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(String a) {

        char c;
        char[] b = a.toCharArray();
        for(int i=0;i<b.length-1;i=i+2) {
            c = b[i];
            b[i] = b[i+1];
            b[i+1] = c;
        }
        String d = new String(b);

        return d;
    }
}
