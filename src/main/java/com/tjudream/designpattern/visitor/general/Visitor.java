package com.tjudream.designpattern.visitor.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:30
 *
 * @author mengxs@lenovocloud.com
 */
public class Visitor implements IVisitor {
    //访问el1元素
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }
    //访问el2元素
    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
