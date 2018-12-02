package com.tjudream.designpattern.visitor.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:27
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteElement1 extends Element {
    //完善业务逻辑
    @Override
    public void doSomething() {
        //业务处理
    }
    //允许哪个访问者来访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
