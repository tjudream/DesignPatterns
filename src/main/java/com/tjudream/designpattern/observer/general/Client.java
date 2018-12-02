package com.tjudream.designpattern.observer.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 12:50
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //定义一个观察者
        Observer obs = new ConcreteObserver();
        //观察者观察被观察者
        subject.addObserver(obs);
        subject.doSomething();
    }
}
