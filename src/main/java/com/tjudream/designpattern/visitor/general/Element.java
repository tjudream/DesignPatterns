package com.tjudream.designpattern.visitor.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:25
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);

}
