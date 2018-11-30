package com.tjudream.designpattern.interpreter.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 13:45
 *
 * @author mengxs@lenovocloud.com
 */
public class NonterminalExpression extends Expression {
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression ...expressions) {

    }
    @Override
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
}
