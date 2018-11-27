package com.tjudream.designpattern.factory.factorymethod.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-27 13:17
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
