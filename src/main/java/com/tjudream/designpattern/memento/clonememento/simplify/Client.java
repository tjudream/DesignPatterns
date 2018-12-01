package com.tjudream.designpattern.memento.clonememento.simplify;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 18:18
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();
        //建立初始状态
        originator.setState("init");
        System.out.println("初始状态是：" + originator.getState());
        //建立备份
        originator.createMemento();
        //修改状态
        originator.setState("update");
        System.out.println("修改后的状态是：" + originator.getState());
        //恢复原始状态
        originator.restoreMemento();
        System.out.println("恢复后的状态是：" + originator.getState());
    }
}
