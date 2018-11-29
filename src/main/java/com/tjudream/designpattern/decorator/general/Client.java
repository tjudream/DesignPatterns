package com.tjudream.designpattern.decorator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:51
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecoratorA(component);
        //第二次修饰
        component = new ConcreteDecoratorB(component);
        //修饰后运行
        component.operate();
    }
}
