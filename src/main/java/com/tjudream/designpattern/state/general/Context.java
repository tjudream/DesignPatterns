package com.tjudream.designpattern.state.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 13:08
 *
 * @author mengxs@lenovocloud.com
 */
public class Context {
    //定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    //当前状态
    private State currentState;
    //获得当前状态
    public State getCurrentState() {
        return currentState;
    }
    //设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        //切换状态
        this.currentState.setContext(this);
    }
    //行为委托
    public void handle1() {
        this.currentState.handler1();
    }
    public void handle2() {
        this.currentState.handler2();
    }
}
