package com.tjudream.designpattern.visitor.general;

import java.util.Random;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:32
 *
 * @author mengxs@lenovocloud.com
 */
public class ObjectStruture {
    //对象生成器，这里通过一个工厂方法模式模拟
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
