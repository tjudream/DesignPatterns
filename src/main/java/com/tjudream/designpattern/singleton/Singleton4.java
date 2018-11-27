package com.tjudream.designpattern.singleton;

/**
 * 描述:
 * 双重检查模式 （DCL）
 * Created by mengxiansen on 2018-11-26 15:53
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton4 {
    private volatile static Singleton4 singleton4;
    private Singleton4() {

    }
    public static Singleton4 Singleton4() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
