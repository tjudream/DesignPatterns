package com.tjudream.designpattern.command.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 11:15
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Receiver {
    //抽象接收者，定义每一个接收者都必须完成的业务
    public abstract void doSomething();
}
