package com.tjudream.designpattern.factory.abstractfactory.general.factory.impl;

import com.tjudream.designpattern.factory.abstractfactory.general.factory.AbstractFactory;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductA;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductB;
import com.tjudream.designpattern.factory.abstractfactory.general.product.impl.ProductA1;
import com.tjudream.designpattern.factory.abstractfactory.general.product.impl.ProductB1;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 14:58
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
