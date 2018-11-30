package com.tjudream.designpattern.mediator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 15:19
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        mediator.doSomething1();
        mediator.doSomething2();
    }
}
