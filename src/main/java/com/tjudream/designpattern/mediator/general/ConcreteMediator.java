package com.tjudream.designpattern.mediator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 15:18
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
