package com.tjudream.designpattern.factory.abstractfactory.general;

import com.tjudream.designpattern.factory.abstractfactory.general.factory.AbstractFactory;
import com.tjudream.designpattern.factory.abstractfactory.general.factory.impl.ConcreteFactory1;
import com.tjudream.designpattern.factory.abstractfactory.general.factory.impl.ConcreteFactory2;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductA;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductB;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 14:59
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义出2个工厂
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        AbstractProductA a1 = concreteFactory1.createProductA();
        AbstractProductA a2 = concreteFactory2.createProductA();
        AbstractProductB b1 = concreteFactory1.createProductB();
        AbstractProductB b2 = concreteFactory2.createProductB();
    }
}
