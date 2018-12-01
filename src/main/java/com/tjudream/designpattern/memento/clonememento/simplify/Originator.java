package com.tjudream.designpattern.memento.clonememento.simplify;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 18:05
 *
 * @author mengxs@lenovocloud.com
 */
public class Originator implements Cloneable {
    private Originator backup;
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建一个备忘录
    public void createMemento() {
        this.backup = this.clone();
    }
    //恢复一个备忘录
    public void restoreMemento() {
        //在进行恢复前应该进行断言，防止空指针
        this.setState(this.backup.getState());
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
