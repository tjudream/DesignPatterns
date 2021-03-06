package com.tjudream.designpattern.proxy.forceproxy;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 17:03
 *
 * @author mengxs@lenovocloud.com
 */
public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    public Proxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void request() {
        this.beforeRequest();
        this.subject.request();
        this.afterRequest();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

    //预处理
    private void beforeRequest() {

    }
    //善后处理
    private void afterRequest() {

    }
}
