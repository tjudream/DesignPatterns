package com.tjudream.designpattern.state.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:07
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class State {
    //定义一个环境角色，提供子类访问
    protected Context context;
    //设置环境角色
    public void setContext(Context context) {
        this.context = context;
    }
    //行为1
    public abstract void handler1();
    //行为2
    public abstract void handler2();
}
