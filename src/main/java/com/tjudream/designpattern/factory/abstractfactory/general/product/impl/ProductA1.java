package com.tjudream.designpattern.factory.abstractfactory.general.product.impl;

import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductA;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 14:53
 *
 * @author mengxs@lenovocloud.com
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("产品A1实现方法");
    }
}
