package com.tjudream.designpattern.templatemethod.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 11:51
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass c1 = new ConcreteClass1();
        AbstractClass c2 = new ConcreteClass2();
        c1.templateMethod();
        c2.templateMethod();
    }
}
