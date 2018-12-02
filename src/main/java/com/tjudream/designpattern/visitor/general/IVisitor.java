package com.tjudream.designpattern.visitor.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:26
 *
 * @author mengxs@lenovocloud.com
 */
public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
