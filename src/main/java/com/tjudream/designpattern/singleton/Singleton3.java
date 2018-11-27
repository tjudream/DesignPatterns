package com.tjudream.designpattern.singleton;

/**
 * 描述:
 * 懒汉模式（线程安全）
 * Created by mengxiansen on 2018-11-26 15:51
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3() {

    }
    public static synchronized Singleton3 getSingleton3() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
