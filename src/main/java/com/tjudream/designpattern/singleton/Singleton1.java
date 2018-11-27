package com.tjudream.designpattern.singleton;

import java.io.ObjectStreamException;

/**
 * 描述:
 *      饿汉模式
 * <p>
 * Created by mengxiansen on 2018-11-26 14:38
 *
 * @author mengxs@lenovocloud.com
 */
public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();
    private Singleton1() {

    }
    public static Singleton1 getSingleton1() {
        return singleton1;
    }

    /**
     * 防止反序列化获得多例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return singleton1;
    }
}
