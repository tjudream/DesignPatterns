package com.tjudream.designpattern.command.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 11:18
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
