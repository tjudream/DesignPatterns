package com.tjudream.designpattern.bridge.general.abstraction;

import com.tjudream.designpattern.bridge.general.implementor.Implementor;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 21:37
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Abstraction {
    private Implementor implementor;
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public void request() {
        this.implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
