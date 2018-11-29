package com.tjudream.designpattern.proxy.personalizedproxy;

import com.tjudream.designpattern.facade.general.SystemC;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 17:03
 *
 * @author mengxs@lenovocloud.com
 */
public class Proxy implements Subject, IProxy {
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    public Proxy(Subject subject) {
        this.subject = subject;
    }
    //通过构造函数传递代理者
    public Proxy(Object ...objects) {

    }
    @Override
    public void request() {
        this.beforeRequest();
        this.subject.request();
        this.afterRequest();
        this.doSomething();
    }
    //预处理
    private void beforeRequest() {

    }
    //善后处理
    private void afterRequest() {

    }

    @Override
    public void doSomething() {
        System.out.println("完成其他事情");
    }
}
