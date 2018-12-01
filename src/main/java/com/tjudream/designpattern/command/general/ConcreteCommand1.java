package com.tjudream.designpattern.command.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 11:19
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteCommand1 extends Command {
    //对哪个receiver类进行命令处理
    private Receiver receiver;
    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }
    //必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        this.receiver.doSomething();
    }
}
