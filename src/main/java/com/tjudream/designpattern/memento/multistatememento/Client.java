package com.tjudream.designpattern.memento.multistatememento;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 19:29
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //初始化
        originator.setState1("s1");
        originator.setState2("s2");
        originator.setState3("s3");
        System.out.println("初始状态： " + originator.toString());
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //修改状态
        originator.setState1("up1");
        originator.setState2("up2");
        originator.setState3("up3");
        System.out.println("修改后的状态：" + originator.toString());
        //恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：" + originator.toString());
    }
}
