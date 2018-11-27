package com.tjudream.designpattern.factory.abstractfactory.general.factory;

import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductA;
import com.tjudream.designpattern.factory.abstractfactory.general.product.AbstractProductB;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 14:56
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class AbstractFactory {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
