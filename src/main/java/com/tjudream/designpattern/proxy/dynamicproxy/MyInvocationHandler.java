package com.tjudream.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 18:25
 *
 * @author mengxs@lenovocloud.com
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target;
    //通过构造函数传递一个对象
    public MyInvocationHandler(Object object) {
        this.target = object;
    }
    //代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
}
