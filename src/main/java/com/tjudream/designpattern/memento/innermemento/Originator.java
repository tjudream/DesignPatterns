package com.tjudream.designpattern.memento.innermemento;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 11:10
 *
 * @author mengxs@lenovocloud.com
 */
public class Originator {
    //内部状态
    private String state;

    //内部类
    private class Memento implements IMemento {
        //发起人的内部状态
        private String state;
        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }
    //恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }
}
