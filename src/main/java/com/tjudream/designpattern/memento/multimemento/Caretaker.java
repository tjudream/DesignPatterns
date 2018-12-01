package com.tjudream.designpattern.memento.multimemento;

import com.tjudream.designpattern.memento.multistatememento.Memento;

import java.util.HashMap;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 17:01
 *
 * @author mengxs@lenovocloud.com
 */
public class Caretaker {
    //容纳备忘录的容器
    private HashMap<String,Memento> memMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
