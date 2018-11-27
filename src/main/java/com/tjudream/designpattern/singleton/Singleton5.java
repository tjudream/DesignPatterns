package com.tjudream.designpattern.singleton;

/**
 * 描述:
 * 静态内部类单例模式
 * Created by mengxiansen on 2018-11-26 16:20
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton5 {
    private Singleton5() {

    }
    public static Singleton5 getSingleton5() {
        return SingletonHolder.singleton5;
    }
    private static class SingletonHolder {
        private static final Singleton5 singleton5 = new Singleton5();
    }
}
