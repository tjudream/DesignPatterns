package com.tjudream.designpattern.interpreter.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 13:43
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
