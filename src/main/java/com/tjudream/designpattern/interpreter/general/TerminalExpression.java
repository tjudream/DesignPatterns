package com.tjudream.designpattern.interpreter.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 13:44
 *
 * @author mengxs@lenovocloud.com
 */
public class TerminalExpression extends Expression {
    //通常终结符表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
