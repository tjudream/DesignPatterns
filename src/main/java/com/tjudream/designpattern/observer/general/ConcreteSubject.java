package com.tjudream.designpattern.observer.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 12:49
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteSubject extends Subject {
    //具体业务
    public void doSomething() {
        /**
         * do something
         */
        super.notifyObservers();
    }
}
