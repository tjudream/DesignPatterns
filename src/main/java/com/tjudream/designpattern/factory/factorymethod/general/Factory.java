package com.tjudream.designpattern.factory.factorymethod.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 13:07
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
