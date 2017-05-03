package com.Interface;

/**
 * Created by a on 2017/5/3.
 */

//实际上这是代理
//    为某个类加上接口来适配Apply

public class Adapter implements Processor {

    o_t_w oTW;

    public Adapter(o_t_w oTW) {
        this.oTW = oTW;
    }

    @Override
    public String name() {
        return this.oTW.name();
    }

    @Override
    public Object process(Object input) {
        return oTW.process((String) input);
    }
}
