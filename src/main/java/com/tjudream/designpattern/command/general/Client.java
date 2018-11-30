package com.tjudream.designpattern.command.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 11:23
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReceiver1();
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
