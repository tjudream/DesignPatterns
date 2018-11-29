package com.tjudream.designpattern.flyweight.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 15:42
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteFlyweight2 extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行业务逻辑处理
    @Override
    public void operate() {

    }
}
