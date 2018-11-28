package com.tjudream.designpattern.prototype.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 16:01
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype clonePrototype = (ConcretePrototype)prototype.clone();
            clonePrototype.doSomething();
        }
    }
}
