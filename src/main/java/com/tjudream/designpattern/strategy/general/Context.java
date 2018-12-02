package com.tjudream.designpattern.strategy.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:37
 *
 * @author mengxs@lenovocloud.com
 */
public class Context {
    //抽象策略
    private Strategy strategy;
    //构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}
