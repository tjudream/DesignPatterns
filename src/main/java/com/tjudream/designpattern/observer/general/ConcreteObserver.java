package com.tjudream.designpattern.observer.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 12:48
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteObserver implements Observer {
    //实现更新算法
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
