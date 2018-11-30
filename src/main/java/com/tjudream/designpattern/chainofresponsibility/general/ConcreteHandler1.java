package com.tjudream.designpattern.chainofresponsibility.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 20:24
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteHandler1 extends Handler {
    //设置自己的处理级别
    @Override
    protected Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }

    //定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
}
