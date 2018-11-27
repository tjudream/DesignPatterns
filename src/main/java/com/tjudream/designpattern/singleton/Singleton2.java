package com.tjudream.designpattern.singleton;

/**
 * 描述:
 *      懒汉模式（线程不安全）
 * <p>
 * Created by mengxiansen on 2018-11-26 15:37
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2() {

    }
    public static Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
