package com.tjudream.designpattern.memento.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 16:22
 *
 * @author mengxs@lenovocloud.com
 */
public class Memento {
    //发起人的内部状态
    private String state = "";
    //构造函数传递参数
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
