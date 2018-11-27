package com.tjudream.designpattern.singleton;

import java.io.ObjectStreamException;

/**
 * 描述:
 * 枚举单例
 * Created by mengxiansen on 2018-11-26 16:23
 *
 * @author mengxs@lenovocloud.com
 */
public enum Singleton6 {
    INSTANCE;
    public void doSomething() {

    }

    /**
     * 防止反序列化获得多例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
    public static void main(String[] args) {
        Singleton6 singleton6 = Singleton6.INSTANCE;
    }
}
