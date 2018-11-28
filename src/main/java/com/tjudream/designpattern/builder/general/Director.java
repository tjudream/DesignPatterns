package com.tjudream.designpattern.builder.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 14:56
 *
 * @author mengxs@lenovocloud.com
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
