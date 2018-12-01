package com.tjudream.designpattern.memento.multimemento;

import com.tjudream.designpattern.memento.multistatememento.Originator;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-01 10:54
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建2个备忘录
        caretaker.setMemento("1", originator.createMemento());
        caretaker.setMemento("2", originator.createMemento());
        //恢复 一个指定的备忘录
        originator.restoreMemento(caretaker.getMemento("1"));
    }
}
