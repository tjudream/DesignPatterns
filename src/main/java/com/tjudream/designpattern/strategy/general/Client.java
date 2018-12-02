package com.tjudream.designpattern.strategy.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:38
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //声明一个具体策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
