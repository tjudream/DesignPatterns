package com.tjudream.designpattern.factory.abstractfactory.general.product.impl;

import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductA;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductB;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 14:53
 *
 * @author mengxs@lenovocloud.com
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void doSomething() {
        System.out.println("产品B1实现方法");
    }
}
