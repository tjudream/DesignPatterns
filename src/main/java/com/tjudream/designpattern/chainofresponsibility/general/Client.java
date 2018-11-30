package com.tjudream.designpattern.chainofresponsibility.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 20:25
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链中的阶段顺序1--> 2-->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        //提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
