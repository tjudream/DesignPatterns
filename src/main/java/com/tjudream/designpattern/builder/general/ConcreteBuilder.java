package com.tjudream.designpattern.builder.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 14:55
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
