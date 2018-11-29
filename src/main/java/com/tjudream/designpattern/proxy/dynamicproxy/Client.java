package com.tjudream.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 18:33
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        //代理行为
        proxy.request("test");
    }
}
