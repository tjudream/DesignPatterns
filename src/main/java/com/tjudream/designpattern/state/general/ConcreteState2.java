package com.tjudream.designpattern.state.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:09
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteState2 extends  State {
    @Override
    public void handler1() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE1);
        //过渡到state2状态，由Context实现
        super.context.handle1();
    }

    @Override
    public void handler2() {
        //本状态下必须处理这个逻辑
    }
}
