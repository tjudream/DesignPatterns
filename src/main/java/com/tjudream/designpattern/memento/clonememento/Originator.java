package com.tjudream.designpattern.memento.clonememento;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 18:05
 *
 * @author mengxs@lenovocloud.com
 */
public class Originator implements Cloneable {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public Originator createMemento() {
        return this.clone();
    }
    //恢复一个备忘录
    public void restoreMemento(Originator originator) {
        this.setState(originator.getState());
    }

    //克隆当前对象
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
