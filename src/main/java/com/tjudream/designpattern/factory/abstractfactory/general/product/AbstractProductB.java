package com.tjudream.designpattern.factory.abstractfactory.general.product;

/**
 * 描述:
 *  抽象产品类
 * <p>
 * Created by mengxiansen on 2018-11-27 14:52
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class AbstractProductB {
    //每个产品共有的方法
    public void shareMethod() {

    }
    //每个产品相同方法、不同实现
    public abstract void doSomething();
}
