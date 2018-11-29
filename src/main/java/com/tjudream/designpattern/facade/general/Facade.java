package com.tjudream.designpattern.facade.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 14:43
 *
 * @author mengxs@lenovocloud.com
 */
public class Facade {
    private SystemA a = new SystemA();
    private SystemB b = new SystemB();
    private SystemC c = new SystemC();
    public void methodA() {
        this.a.operationA();
    }
    public void methodB() {
        this.b.operationB();
    }
    public void methodC() {
        this.c.operationC();
    }
    public void warpOperation() {
        this.a.operationA();
        this.b.operationB();
        this.c.operationC();
    }
}
