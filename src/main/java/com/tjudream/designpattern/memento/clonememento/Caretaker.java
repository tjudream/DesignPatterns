package com.tjudream.designpattern.memento.clonememento;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 18:08
 *
 * @author mengxs@lenovocloud.com
 */
public class Caretaker {
    //发起人对象
    private Originator originator;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
