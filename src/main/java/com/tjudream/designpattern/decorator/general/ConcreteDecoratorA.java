package com.tjudream.designpattern.decorator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:48
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteDecoratorA extends Decorator {
    //定义被修饰者
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    public void method1() {
        System.out.println("method1 修饰");
    }
    //重写父类的operate方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
