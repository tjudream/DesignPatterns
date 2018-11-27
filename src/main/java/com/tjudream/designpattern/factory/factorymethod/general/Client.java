package com.tjudream.designpattern.factory.factorymethod.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 13:19
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
    }
}
