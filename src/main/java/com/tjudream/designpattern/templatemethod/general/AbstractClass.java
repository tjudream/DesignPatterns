package com.tjudream.designpattern.templatemethod.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 11:49
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class AbstractClass {
    protected abstract void doAnything();
    protected abstract void doSomething();
    public void templateMethod() {
        this.doAnything();
        this.doSomething();
    }
}
