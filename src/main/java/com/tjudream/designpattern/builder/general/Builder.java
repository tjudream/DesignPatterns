package com.tjudream.designpattern.builder.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 14:53
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
