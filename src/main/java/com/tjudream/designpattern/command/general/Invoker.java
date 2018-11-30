package com.tjudream.designpattern.command.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 11:21
 *
 * @author mengxs@lenovocloud.com
 */
public class Invoker {
    private Command command;
    //接受命令
    public void setCommand(Command _command) {
        this.command = _command;
    }
    //执行命令
    public void action() {
        this.command.execute();
    }
}
