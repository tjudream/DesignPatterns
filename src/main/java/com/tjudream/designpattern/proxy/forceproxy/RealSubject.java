package com.tjudream.designpattern.proxy.forceproxy;

import com.sun.org.apache.regexp.internal.RE;
import com.tjudream.designpattern.facade.general.SystemC;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 17:03
 *
 * @author mengxs@lenovocloud.com
 */
public class RealSubject implements Subject {
    private String name;
    private Subject proxy;
    public RealSubject(String name) {
        this.name = name;
    }
    @Override
    public void request() {
        if (this.isProxy()) {
            System.out.println("通过代理调用，可以调用");
            //处理业务逻辑
        } else {
            System.out.println("必须使用代理调用，否则不响应！！！");
        }
    }

    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
