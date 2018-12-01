package com.tjudream.designpattern.memento.innermemento;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 11:14
 *
 * @author mengxs@lenovocloud.com
 */
public class Caretaker {
    //备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
