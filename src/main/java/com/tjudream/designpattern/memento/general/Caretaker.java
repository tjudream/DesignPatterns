package com.tjudream.designpattern.memento.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 17:01
 *
 * @author mengxs@lenovocloud.com
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
