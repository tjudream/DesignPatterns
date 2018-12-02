package com.tjudream.designpattern.strategy.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:36
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
