package com.tjudream.designpattern.state.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:09
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteState1 extends  State {
    @Override
    public void handler1() {
        //本状态下必须处理这个逻辑
    }

    @Override
    public void handler2() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);
        //过渡到state2状态，由Context实现
        super.context.handle2();
    }
}
