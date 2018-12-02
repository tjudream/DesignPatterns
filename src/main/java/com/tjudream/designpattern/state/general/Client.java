package com.tjudream.designpattern.state.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:17
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //执行行为
        context.handle1();
        context.handle2();
    }
}
